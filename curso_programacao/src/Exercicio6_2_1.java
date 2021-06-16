import java.util.Scanner;

public class Exercicio6_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int X = sc.nextInt();
		for(int i = 1; i<X; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
