import java.util.Scanner;

public class Exercício6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		while(X !=0 && Y!=0) {
			if(X>0 && Y>0) {
				System.out.println("primeiro");
			}
			else if (X<0 && Y<0) {
				System.out.println("terceiro");
			}
			else if(X>0 && Y<0) {
				System.out.println("quarto");
			}
			else {
				System.out.println("segundo");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		sc.close();
	}

}
