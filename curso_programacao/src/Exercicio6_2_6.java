import java.util.Scanner;

public class Exercicio6_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			if(N%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
