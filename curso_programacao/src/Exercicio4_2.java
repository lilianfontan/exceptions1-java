import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double raio = sc.nextDouble();
		double area = 0;
		double pi = 3.14159;
		area = pi*(Math.pow(raio, 2.0));
		System.out.printf("A = %.4f", area);
		sc.close();
	}

}
