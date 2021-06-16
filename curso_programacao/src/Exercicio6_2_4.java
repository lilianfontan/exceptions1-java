import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			double divisao;
			if(denominador == 0) {
				System.out.println("divisão impossível");
			}
			else {
				divisao = (double) numerador / denominador;
				System.out.printf("%.1f%n", divisao);
			}
		}
		sc.close();

	}

}
