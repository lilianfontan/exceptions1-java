import java.util.Scanner;

public class Exercicio6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int senhaDigitada = sc.nextInt();
		
		while (senhaDigitada != 2002) {
			System.out.println("Senha Inválida");
			senhaDigitada = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
