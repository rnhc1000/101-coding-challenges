package advancedTopics.referenceMethods;

import java.util.ArrayList;
import java.util.List;

record Producto(String name, Double price) {
    public void imprime() {
	System.out.println(name + " = " + price);
    }
}

public class MethodReferencesThree {

    public static void main(String[] args) {

	List<Producto> lista = new ArrayList<>();

	lista.add(new Producto("TV 42'", 2000.00));
	lista.add(new Producto("Geladeira 470L'", 3200.00));
	lista.add(new Producto("Fogão 4 bocas", 900.00));
	lista.add(new Producto("Videogame", 1999.00));
	lista.add(new Producto("Microondas", 550.00));

	/*
	 * Method reference Referência a um método de instância (imprime) de um objeto
	 * arbitrário (?) a partir de um tipo específico (Producto)
	 */
	lista.forEach(Producto::imprime);

    }
}