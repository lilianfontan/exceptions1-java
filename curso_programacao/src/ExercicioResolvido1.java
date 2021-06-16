import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		double largura;
		double comprimento;
		double area;
		double precoMetro;
		double precoTotal;
		
		Scanner sc = new Scanner(System.in);
		
		largura = sc.nextDouble();
		comprimento = sc.nextDouble();
		precoMetro = sc.nextDouble();
				
		area = largura * comprimento;
		precoTotal = precoMetro * area;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", precoTotal);
		sc.close();
		

	}

}
