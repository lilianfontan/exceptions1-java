import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int peca1 = sc.nextInt();
		int numeroPeca1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();
		sc.nextLine();
		int peca2 = sc.nextInt();
		int numeroPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		sc.nextLine();
		
		double valorTotal = 0;
		valorTotal = numeroPeca1*valorPeca1 + numeroPeca2*valorPeca2; 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		sc.close();
		

	}

}
