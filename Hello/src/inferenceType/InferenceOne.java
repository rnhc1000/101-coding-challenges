package inferenceType;

public class InferenceOne {

    public static void main(String[] args) {

	// Classe interna anônima
	SomaTudo<String> somaString = new SomaTudo<>() {

	    @Override
	    public String soma(String a, String b) {
		return a + b;
	    }
	};

	System.out.println(somaString.soma("Olá", " mundo!"));

    }

}