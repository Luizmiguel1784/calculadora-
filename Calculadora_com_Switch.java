package aula28janeiro;
	import java.util.Scanner;
public class Calculadora_com_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, z, resultado;
		char operaçao;
		

		System.out.print("digite o primeiro numero ");
		x = sc.nextDouble();
		System.out.print("digite o segundo numero ");
		y = sc.nextDouble();
  System.out.print("digite o segundo numero ");
		z = sc.nextDouble();
		
		System.out.print("digite a operação (+, -, *, /, P,): ");
		operaçao = sc.next().charAt(0);
		switch (operaçao) {
		case '+': 
			resultado = x + y;
			System.out.println("Resultado: "+ resultado);
			break;
		case '-': 
			resultado = x - y;
			System.out.println("Resultado: "+ resultado);
			break;
   case 'P': 
			resultado = x /100 * y;
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
