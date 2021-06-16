import java.util.Scanner;

public class Exercicio6_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			int quadrado = i*i;
			int cubo = quadrado * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		sc.close();
	}

}
