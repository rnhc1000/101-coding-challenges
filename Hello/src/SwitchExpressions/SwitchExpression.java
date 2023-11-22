package SwitchExpressions;

import java.util.Scanner;

public class SwitchExpression {
    public static void main(String[] args) {

	System.out.print("Digite um dia da semana: ");
	Scanner input = new Scanner(System.in);
	String dia = input.nextLine();
	input.close();
	dia = dia.toLowerCase();
	String resultado = "";
	switch (dia) {

	case "segunda":
	    resultado = "dia útil";
	    break;
	case "terça":
	case "terca":
	    resultado = "dia útil";
	    break;
	case "quarta":
	    resultado = "dia útil";
	    break;
	case "quinta":
	    resultado = "dia útil";
	    break;
	case "sexta":
	    resultado = "dia útil";
	    break;
	case "sábado":
	case "sabado":
	    resultado = "fim de semana";
	    break;
	case "domingo":
	    resultado = "fim de semana";
	    break;
	default:
	    resultado = "dia inválido";
	    break;

	}
	resultado = switch (dia) {

	case "segunda":
	    yield "dia útil";
	case "terça":
	case "terca":
	    yield "dia útil";
	case "quarta":
	    yield "dia útil";
	case "quinta":
	    yield "dia útil";
	case "sexta":
	    yield "dia útil";
	case "sábado":
	case "sabado":
	    yield "fim de semana";
	case "domingo":
	    yield "fim de semana";
	default:
	    yield "dia inválido";

	};

	System.out.println("Yield: " + resultado);

	resultado = switch (dia) {

	case "segunda" -> "dia útil";
	case "terca" -> "dia útil";
	case "quarta" -> "dia útil";
	case "quinta" -> "dia útil";
	case "sexta" -> "dia útil";
	case "sabado" -> "fim de semana";
	case "domingo" -> "fim de semana";
	default -> "dia invalido";
	};

	System.out.println(resultado);

	resultado = switch (dia) {
	case "segunda", "terca", "terça", "quarta", "quinta", "sexta" -> "dia útil";
	case "sabado", "sábado", "domingo" -> "fim de semana";
	default -> "dia inválido";
	};

	System.out.println("Final!!!" + resultado);

    }

}
