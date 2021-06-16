import java.util.Scanner;

public class Exercício5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		if(A%2==0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}
