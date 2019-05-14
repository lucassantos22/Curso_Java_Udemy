package aula123_excecoes;

public class Account {
	
	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double moneyToDeposit) {
		this.setBalance(this.getBalance() + moneyToDeposit);
		
		System.out.println("R$" + moneyToDeposit + " depositados na conta" );
		System.out.println("Saldo total: " + this.getBalance());
	}
	
	public void withdraw(double moneyToWithdraw) throws WithdrawException{
		if(moneyToWithdraw > this.getWithdrawLimit()) {
			throw new WithdrawException("Valor do saque passou de seu limite.");
		}
		if(moneyToWithdraw > this.getBalance()) {
			throw new WithdrawException("Valor do saque maior que o saldo da conta.");		
		}
		this.setBalance(this.getBalance() - moneyToWithdraw);
		
		System.out.println("R" + moneyToWithdraw + "$ sacados da conta" );
		System.out.println("Saldo total: " + this.getBalance());
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

}
