package advancedTopics.referenceMethods;

@FunctionalInterface
interface Figura2DX {
    Retangulox desenha(Double largura, Double altura);
}

class Retangulox {

    public Retangulox(Double largura, Double altura) {
	System.out.println("Desenha retângulo de Largura: " + largura + " e Altura: " + altura);
    }
}

public class MethodReferencesFour {

    public static void main(String[] args) {

	/*
	 * Method reference Referência a um construtor
	 */
	Figura2DX fig1 = Retangulox::new;

	fig1.desenha(10.5, 7.0);

    }

}