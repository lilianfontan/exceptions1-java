package application;

import java.util.Scanner;

public class Exemplo3Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int [3][3];
		int numerosNegativos = 0;
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j]<0) {
					numerosNegativos += 1;
				}
			}
		}
		
		System.out.println("Main diagonal");
		for(int i = 0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		System.out.println("Negative numbers: " + numerosNegativos);
		
		
		
		sc.close();
	}

}
