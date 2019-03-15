package aula69;

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número de alturas a serem cadastradas:");
		int numeroDeAlturas = sc.nextInt();
		
		double[] alturas = new double[numeroDeAlturas];
		
		for(int i=0; i<numeroDeAlturas; i++) {
			int index = i + 1;
			System.out.println("Insira o número da altura "+ index + ":");
			double altura = sc.nextDouble();
			alturas[i] = altura;
		}
		
		double mediaAlturas = 0;
		
		for(int i=0; i<alturas.length; i++) {
			mediaAlturas += alturas[i];
		}
		
		mediaAlturas = mediaAlturas/numeroDeAlturas;
		
		System.out.println("A média das alturas é:");
		System.out.println(mediaAlturas);
	}

}
