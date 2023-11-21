package genericOne;

record Pessoa(String name, Integer age, Character gender) {

}

public class RecordClass {

    public static void main(String[] args) {

	Pessoa ricardo = new Pessoa("Ricardo", 66, 'M');

	System.out.println(ricardo.name());

    }

}
