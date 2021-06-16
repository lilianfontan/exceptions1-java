package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1Aula9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("testes: ");
		String teste = sc.nextLine();
		int teste2 = sc.nextInt();
		System.out.println();
		teste2 = teste2+1;
		
		System.out.println("teste 2");
		System.out.println(teste + teste2);
		
		sc.close();
		

	}

}
