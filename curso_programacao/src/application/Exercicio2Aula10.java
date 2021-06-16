package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities2.Employee;

public class Exercicio2Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		System.out.println();
		
		for(int i = 1; i<=N; i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			Employee employee = new Employee(id,name,salary);
			list.add(employee);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		
		Employee emp = list.stream().filter(x ->x.getId()==idIncrease).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();		
		System.out.println("List of employees:");
		for(Employee x:list) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
