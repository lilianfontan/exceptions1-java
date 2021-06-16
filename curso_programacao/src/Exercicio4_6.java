import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		//Constantes
		double pi = 3.14159;
		
		//Cálculos
		double itemA = (A*C)/2;
		double itemB = pi*C*C;
		double itemC = (A+B)*C/2;
		double itemD = B*B;
		double itemE = A*B;
		
		//Saídas
		System.out.printf("TRIANGULO: %.3f%n", itemA);
		System.out.printf("CIRCULO: %.3f%n", itemB);
		System.out.printf("TRAPEZIO: %.3f%n", itemC);
		System.out.printf("QUADRADO: %.3f%n", itemD);
		System.out.printf("RETANGULO: %.3f%n", itemE);
		
		sc.close();
				

	}

}
