package advancedTopics.lambda;

import java.util.ArrayList;
import java.util.List;

record Producto(String name, Double price) {

}

public class LambdaArguments {

    public static void main(String[] args) {

	List<Producto> lista = new ArrayList<>();

	lista.add(new Producto("TV 42'", 2000.00));
	lista.add(new Producto("Geladeira 470L'", 3200.00));
	lista.add(new Producto("Fogão 4 bocas", 900.00));
	lista.add(new Producto("Videogame", 1999.00));
	lista.add(new Producto("Microondas", 550.00));

	/*
	 * Parametro: interface Consumer JDK 1.8
	 *
	 * Lambda expression com um argumento
	 */
	lista.forEach((p) -> System.out.println(p.name() + " = " + p.price()));

	System.out.println("*********************** Ordem crescente de preços **************************");

	/*
	 * Parametro: interface Comparator JDK 1.2
	 * 
	 * Lambda expression com dois argumentos
	 */
	lista.sort((p1, p2) -> p1.price().compareTo(p2.price()));

	lista.forEach((p) -> System.out.println(p.name() + " = " + p.price()));
    }

}
