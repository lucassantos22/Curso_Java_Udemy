package aula62;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Banco banco;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String accountHolder = sc.nextLine();
	
		System.out.println("Is there an initial deposit? (y/n) ");
		char initialDepositConditional = sc.nextLine().charAt(0);
		
		if(initialDepositConditional == 'y') {
			System.out.println("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();
			banco = new Banco(accountHolder, accountNumber, initialDeposit);
			banco.saque(1);
			banco.deposito(6);
		}else if(initialDepositConditional == 'n') {
			banco = new Banco(accountHolder, accountNumber);
		}else {
			System.out.println("Insert a valuable caracter");
		}
		

	}

}
