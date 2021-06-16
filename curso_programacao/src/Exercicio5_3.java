import java.util.Scanner;

public class Exercicio5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			if(A%B == 0) {
				System.out.println("São Múltiplos");
			}
			else {
				System.out.println("Não são Múltiplos");
			}
		}
		else {
			if(B%A==0) {
				System.out.println("São Múltiplos");
			}
			else {
				System.out.println("Não são Múltiplos");
			}
		}
		sc.close();
	}

}
