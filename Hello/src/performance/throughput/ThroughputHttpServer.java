package performance.throughput;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class ThroughputHttpServer {

    private static final String INPUT_FILE = "/home/rferreira/Downloads/WarAndPeace.txt";
    private static final int NUMBER_OF_THREADS = 1;

    public static void main(String[] args) {
	String text = "";
	try {
	    text = new String(Files.readAllBytes(Paths.get(INPUT_FILE)));
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	startServer(text);
    }

    public static void startServer(String text) {
	HttpServer server;
	try {
	    server = HttpServer.create(new InetSocketAddress(8080), 0);
	    server.createContext("/search", new WordCountHandler(text));
	    Executor executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
	    server.setExecutor(executor);
	    server.start();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    private static class WordCountHandler implements HttpHandler {
	private String text;

	public WordCountHandler(String text) {
	    this.text = text;
	}

	public void handle(HttpExchange httpExchange) throws IOException {

	    String query = httpExchange.getRequestURI().getQuery();
	    String[] keyValue = query.split("=");
	    String action = keyValue[0];
	    String word = keyValue[1];
	    if (action.equals("word")) {
		httpExchange.sendResponseHeaders(400, 0);
		return;
	    }

	    long count = countWord(word);
	    System.out.println(word);
	    byte[] response = Long.toString(count).getBytes();
	    httpExchange.sendResponseHeaders(200, response.length);
	    OutputStream outputStream = httpExchange.getResponseBody();
	    outputStream.write(response);
	    outputStream.close();

	}

	private long countWord(String word) {
	    long count = 0;
	    int index = 0;
	    while (index >= 0) {
		index = text.indexOf(word, index);
		if (index >= 0) {

		    count++;
		    index++;
		}

	    }
	    return count;
	}

    }
}
