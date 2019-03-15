package aula62;

public class Banco {
	
	private int numeroConta;
	private String titularConta;
	private double depositoInicial = 0;
	
	public Banco(String titularConta, int numeroConta) {
		this.setTitularConta(titularConta);
		this.setNumeroConta(numeroConta);
	}
	
	public Banco(String titularConta, int numeroConta, double depositoInicial) {
		this(titularConta, numeroConta);
		this.deposito(depositoInicial);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	private void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}

	public void deposito(double dinheiro) {
		this.setDepositoInicial(this.getDepositoInicial() + dinheiro);
		System.out.println(">>> Saldo Disponível <<<");
		System.out.println(this.getDepositoInicial());
	}
	
	public void saque(double dinheiro) {
		this.setDepositoInicial(this.getDepositoInicial() - dinheiro - 5);
		System.out.println(">>> Saldo Disponível <<<");
		System.out.println(this.getDepositoInicial());
	}

}
