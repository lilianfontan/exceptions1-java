package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exercicio3Aula8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.notaFinal());
		student.situacaoFinal();
		
		
		sc.close();
	}

}
