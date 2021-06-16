import java.util.Locale;
import java.util.Scanner;

public class Exercicio5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int codigoItem = sc.nextInt();
		int quantidadeItem = sc.nextInt();
		double precoItem;
		double valorAPagar;
		
		switch(codigoItem) {
		case 1:
			precoItem = 4.00;
			break;
		case 2:
			precoItem = 4.50;
			break;
		case 3:
			precoItem = 5.00;
			break;
		case 4:
			precoItem = 2.00;
			break;
		case 5:
			precoItem = 1.50;
			break;
		default:
			precoItem = 0;
			break;
		}
		valorAPagar = precoItem * quantidadeItem;
		System.out.printf("TOTAL: R$%.2f", valorAPagar);
		sc.close();
	
	}

}
