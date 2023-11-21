package advancedTopics.referenceMethods;

@FunctionalInterface
interface Figura2D {
    void desenha(Double largura, Double altura);
}

//Observe que a classe Retângulo não está implementando a interface Figura
class Retangulo {

    public void desenhaRetangulo(Double largura, Double altura) {
	System.out.println("Desenha retângulo de Largura: " + largura + " e Altura: " + altura);
    }
}

//Referência a um método de instância de um objeto particular
public class MethodReferencesOne {

    public static void main(String[] args) {

	// Lambda expression
	Figura2D fig1 = (largura, altura) -> System.out
		.println("Desenha retângulo de Largura: " + largura + " e Altura: " + altura);

	fig1.desenha(8.0, 1.5);

	/*************************************************************/

	// Objeto específico
	Retangulo ret = new Retangulo();
	/*
	 * Method reference Referência a um método de instância (desenhaRetangulo) de um
	 * objeto particular (ret)
	 */
	Figura2D fig2 = ret::desenhaRetangulo;

	fig2.desenha(10.5, 7.0);
    }

}