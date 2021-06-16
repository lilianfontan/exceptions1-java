package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exemplo1Aula8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Rectangle rectangle = new Rectangle ();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = " + rectangle.area());
		System.out.println();
		System.out.printf("PERIMETER = " + rectangle.perimeter() + "%n");
		System.out.printf("DIAGONAL = " + rectangle.diagonal());
		
		sc.close();

	}

}
