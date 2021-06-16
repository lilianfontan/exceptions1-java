package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Exercício4Aula8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("What is the dollar price?");
		double priceDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		System.out.println();
		double quantDollar = sc.nextDouble();
		System.out.println();
		double valorFinal = CurrencyConverter.valorReais(priceDollar, quantDollar);
		System.out.printf("Amount to be paid in reais = %.2f", valorFinal);
		sc.close();
	}

}
