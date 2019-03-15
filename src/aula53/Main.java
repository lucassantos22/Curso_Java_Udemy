package aula53;

import java.util.Scanner;

public class Main {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar prince? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarsBought = sc.nextDouble();
		
		System.out.print("Amount to be paid in Reais = " + Dolar.conversor(dollarPrice, dollarsBought));
		
		sc.close();
	}
	
}
