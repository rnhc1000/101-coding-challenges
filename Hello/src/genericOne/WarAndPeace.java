package genericOne;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WarAndPeace {

    public static void main(String[] args) {
	String path = "/home/rferreira/Downloads/WarAndPeace.txt";

	List<String> book = new ArrayList<>();

	book = ReadBook.readBook(path);
	System.out.println(book);

	boolean isVowel = ReadBook.isVowel('a');

	System.out.println(isVowel);

    }

    class ReadBook {

	public ReadBook() {

	}

	private static List<String> readBook(String path) {

	    List<String> bookRead = new ArrayList<>();
	    int lineCount = 10000;

	    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

		String lineRead = null;
		while (lineCount > 0) {
		    if ((lineRead = br.readLine()) != null) {
			bookRead.add(lineRead);
			bookRead.add("\n");
			lineCount--;
		    } else {
			break;
		    }

		}

	    } catch (FileNotFoundException ex) {
		System.out.println("Error: " + ex.getMessage());

	    } catch (IOException ex) {
		System.out.println("Error: " + ex.getMessage());
	    }

	    return bookRead;
	}

	public static boolean isVowel(char c) {

	    return "aeiouAEIOU".indexOf(c) >= 0;
	}

    }
}
