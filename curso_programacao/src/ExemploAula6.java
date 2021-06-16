import java.util.Locale;
import java.util.Scanner;

public class ExemploAula6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		char repetir;
		double temperaturaCelsius;
		double temperaturaFahrenheit;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			temperaturaCelsius = sc.nextDouble();
			temperaturaFahrenheit = (9*temperaturaCelsius)/5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", temperaturaFahrenheit);
			System.out.println("Deseja repetir (s/n)?");
			repetir = sc.next().charAt(0);
		}
		while(repetir == 's');
		sc.close();
	}

}
