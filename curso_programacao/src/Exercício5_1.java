import java.util.Scanner;

public class Exercício5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		
		if(A<0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
		

	}

}
