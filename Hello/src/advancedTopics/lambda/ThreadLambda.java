package advancedTopics.lambda;

@FunctionalInterface
interface Figura {

    void desenha();
}

@FunctionalInterface
interface Sum {
    int sum(int a, int b);
}

//Classe concreta implementa a interface Figura
class Circunferencia implements Figura {

    @Override
    public void desenha() {
	System.out.println("\nClasse Circunferencia: desenha circunferência.");
    }
}

public class ThreadLambda {

    public static void main(String[] args) {

	// Implementação sem lambda expression - utilizando classe concreta
	Circunferencia cir = new Circunferencia();
	cir.desenha();

	/*************************************************************/

	// Implementação sem lambda expression - utilizando classe anônima
	Sum soma = new Sum() {
	    @Override
	    public int sum(int a, int b) {
		return a + b;
	    }
	};
	System.out.println(soma.sum(10, 20));

	Figura fig = new Figura() {

	    @Override
	    public void desenha() {
		System.out.println("\nInterface Figura: desenha circunferência.");
	    }
	};
	fig.desenha();

	/*************************************************************/

	// Lambda expression sem argumentos
	Figura fig2 = () -> System.out.println("\nLambda Expression: desenha circunferência.");
	fig2.desenha();

	/*************************************************************/

	// Lambda expression sem argumentos e com múltiplos métodos
	Figura fig3 = () -> {
	    System.out.println("\nLambda Expression - múltiplos métodos:");
	    System.out.println("desenha circunferência.");
	};
	fig3.desenha();

	// Thread SEM lambda
	Thread t1 = new Thread(new Runnable() {

	    @Override
	    public void run() {
		System.out.println("Thread 1 em execução...");
	    }
	});
	t1.start();

	// Thread COM lambda
	Thread t2 = new Thread(() -> {
	    System.out.println("Thread 2 em execução...");
	});
	t2.start();

    }
}
