import java.util.Locale;
import java.util.Scanner;

public class Exercício5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double ponto1 = sc.nextDouble();
		double ponto2 = sc.nextDouble();
		
		if(ponto1>0 && ponto2>0) {
			System.out.println("Q1");
		}
		else if(ponto1<0 && ponto2<0) {
			System.out.println("Q3");
		}
		else if(ponto1>0 && ponto2<0) {
			System.out.println("Q4");
		}
		else if(ponto1<0 && ponto2>0) {
			System.out.println("Q2");
		}
		else if(ponto1==0 && ponto2 == 0) {
			System.out.println("Origem");
		}
		else if(ponto1 == 0) {
			System.out.println("Eixo X");
		}
		else {
			System.out.println("Eixo Y");
		}
		sc.close();

	}

}
