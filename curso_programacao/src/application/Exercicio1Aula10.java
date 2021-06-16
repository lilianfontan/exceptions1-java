package application;

import java.util.Scanner;

import entities.Rent;

public class Exercicio1Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Rent [] vect = new Rent[10];
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			sc.nextLine();
			int sum = i + 1;
			System.out.println("Rent# " + sum);
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();			
			vect[quarto]=new Rent(nome,email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0;i<vect.length; i++) {
			if(vect[i]!=null) {
				System.out.println(i + " " + vect[i]);
			}
		}
		sc.close();
	}

}
