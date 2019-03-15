package aula79_exercicio_matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o n�mero de linhas e colunas da matriz");
		int numeroLinhasColunas = sc.nextInt();

		int matriz[][] = new int[numeroLinhasColunas][numeroLinhasColunas];
		
		for(int i=0; i<matriz.length; i++) {
			for(int f=0; f<matriz[i].length; f++) {
				System.out.println("Insira o n�mero da posi��o [" + i +"][" + f+"]");
				matriz[i][f] = sc.nextInt();
			}
		}
		
		// Diagonal principa�
		
		System.out.println("Main diagonal:");
		for(int i=0; i<matriz.length; i++) {
			System.out.println(matriz[i][i]);
		}
		
		sc.close();
		
		
		// Quantidade de n�meros negativos
		int quantidadeNumerosNegativos = 0;
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j]<0) {
					quantidadeNumerosNegativos++;
				}
			}
		}
		
		System.out.println("Quantidade de n�meros negativos: " + quantidadeNumerosNegativos);
	}

}
