import java.util.Scanner;

public class Exercicio6_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int fatorial = 1;
		if (N==0) {
			fatorial = 1;
		}
		else {
			for(int i = N; i>0; i--) {
				fatorial = fatorial * i;
			}
		}
		
		System.out.println(fatorial);
		sc.close();
		
		

	}

}
