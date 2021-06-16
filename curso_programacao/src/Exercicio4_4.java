import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
				
		int number = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = 0;
		salario = horasTrabalhadas*valorHora;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
		
	}

}
