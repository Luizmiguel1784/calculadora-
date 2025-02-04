package aula28janeiro;

import java.util.Scanner;

public class Teste_de_porcentagem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x, y, b, resultado;
		char operaçao;
		
		System.out.print("digite a operação (+, -, *, /, p, c, n,): ");
		operaçao = sc.next().charAt(0);
		
		System.out.print("digite o primeiro numero ");
		x = sc.nextDouble();
		System.out.print("digite o segundo numero ");
		y = sc.nextDouble();
		System.out.print("digite o terceiro numero ");
		b = sc.nextDouble();
		
		switch (operaçao) {
		case '+': 
			resultado = x + y;
			System.out.println("Resultado: "+ resultado);
			break;
		case 'p':
		resultado = x /100 * y;
		System.out.println("resultado: "+ resultado);
		break;
		
		case 'c':
			resultado = x * y / b;
			System.out.println("resultado: "+ resultado);
			break;
		case 'n':
			resultado = x * b / y;
			System.out.println("resultado: "+ resultado);
			break;
			
		case '-': 
			resultado = x - y;
			System.out.println("Resultado: "+ resultado);
			break;
		case '*': 
			resultado = x * y;
			System.out.println("Resultado: "+ resultado);
			break;
		case '/': 
			if (y != 0) { 
				resultado = x / y;
				System.out.println("resultado: " + resultado);
			} else {System.out.println("Erro Divisão por zero não permitida");
			
		
		} break;
		default:System.out.println("operação invalida");
			
		}sc.close();
	}

}
