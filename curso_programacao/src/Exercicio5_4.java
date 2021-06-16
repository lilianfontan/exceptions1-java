import java.util.Scanner;

public class Exercicio5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		
		int tempoDeJogo;
		
		if(inicio == fim) {
			tempoDeJogo = 24;
		}
		
		else if(fim>inicio) {
			tempoDeJogo = fim - inicio;
		}
		else {
			tempoDeJogo = 24 - inicio + fim;
		}
		
		System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
		
		sc.close();
				

	}

}
