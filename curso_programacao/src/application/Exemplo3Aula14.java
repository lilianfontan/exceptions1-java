package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.Color;
import entities2.Circle;
import entities2.Rectangle;
import entities2.Shape;

public class Exemplo3Aula14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char response = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(response == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		for(Shape c : list) {
			System.out.printf("%.2f%n", c.area());
		}
		
		sc.close();
	}
}
