package aula123_excecoes;

public class Programm {
	
	public static void main(String[] args) throws WithdrawException {
		
		Account account = new Account(1, "Lucas Gilmar", 2000.0);
		account.deposit(5000);
		try {
			account.withdraw(2001);
		}catch (WithdrawException e) {
			System.out.println(e);
		}
		
	}
	
}
