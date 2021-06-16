import java.util.Scanner;

public class Exercicio6_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		int valorRecebido;
		for(int i=0; i<N; i++) {
			valorRecebido = sc.nextInt();
			if(valorRecebido<10 || valorRecebido >20) {
				out = out + 1;
			}
			else{
				in = in + 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
