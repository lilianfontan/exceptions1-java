package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2Aula8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
				
		System.out.printf("Employee: %s, $%.2f%n", employee.name, employee.netSalary());
		
		System.out.print("Which percentage to increase salary?");
		
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.printf("Update data: %s, $%.2f", employee.name, employee.netSalary());
		sc.close();

	}

}
