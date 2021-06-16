import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		double valor1;
		double valor2;
		double valor3;
		double media;
		
		for(int i = 0; i<N; i++) {
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			media = (valor1*2 + valor2*3 + valor3*5)/10;
			System.out.printf("%.1f", media);
		}
		sc.close();

	}

}
