package application;

import java.util.Scanner;

public class Exercicio3Aula10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//matriz de m linhas e n colunas
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matriz[][] = new int [m][n];
		
		for(int i =0; i<matriz.length;i++) {
			for(int j = 0; j<matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int valorBuscado = sc.nextInt();
		for(int i =0; i<matriz.length;i++) {
			for(int j = 0; j<matriz[i].length;j++) {
				if(matriz[i][j]==valorBuscado) {
					System.out.println("Position: "+ i + ", "+j);
					if(j>0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if(j<matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i>0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(i<matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
