package application;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Exemplo2Aula13 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		//definição do Worker
		System.out.print("Enter department's name: ");
		String name = sc.nextLine();
		Department department = new Department (name);
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String nameWorker = sc.nextLine();
		//System.out.println();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(level), baseSalary, department);
		
		
		System.out.print("How many contracts to this worker? ");
		int N = sc.nextInt();
		HourContract hourContract;
		for (int i = 1; i<=N; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date data = sdf1.parse(sc.next());
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			hourContract = new HourContract(data, valuePerHour, hours);
			worker.addContract(hourContract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + department.getName());
		//System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format(".2f", worker.income(year, month)));
		
		sc.close();
}
}
