package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com 2 números inteiros: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0;i<mat.length;i++) {
			for (int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		
        for (int i=0;i<mat.length;i++) {
        	for (int j=0;j<mat[i].length;j++) {
        		if (mat[i][j] == k) {
        			System.out.println("Posição: " + i + "," + j);
        			if (j > 0) {
        				System.out.println("Esquerda: " + mat[i][j-1]);
        			}
        			if (i > 0) {
        				System.out.println("Acima: " + mat[i-1][j]);
        			}
        			if (j < mat[i].length-1) {
        				System.out.println("Direita: " + mat[i][j+1]);
        			}
        			if (i < mat.length-1) {
        				System.out.println("Abaixo: " + mat[i+1][j]);
        			}
        		}
        	}
        }
		
        System.out.println("Tchau, até a próxima.");
        
		sc.close();
	}

}
