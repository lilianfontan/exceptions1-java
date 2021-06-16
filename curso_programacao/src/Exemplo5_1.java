import java.util.Locale;
import java.util.Scanner;

public class Exemplo5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int numeroMinutos = sc.nextInt();
		double valorFinal = 50 + 2*(numeroMinutos-100);
		
		if(numeroMinutos<100) {
			System.out.println("Valor a pagar: R$50.00");
		}
		else {
			System.out.printf("Valor a pagar: R$%.2f", valorFinal);
		}
		
		sc.close();

	}

}
