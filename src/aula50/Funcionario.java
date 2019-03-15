package aula50;

public class Funcionario {

	private String nome;
	private double salarioBruto;
	private double impostos;

	public Funcionario(String nome, double salarioBruto, double impostos) {
		this.setNome(nome);
		this.setSalarioBruto(salarioBruto);
		this.setImpostos(impostos);
	}
	
	public double salarioLiquido() {
		return this.getSalarioBruto() - this.getImpostos();
	}
	
	public void acrescentarSalario(double salario) {
		this.setSalarioBruto(this.salarioBruto + (this.salarioBruto*salario/100));
	}
	
//	return this.getSalarioBruto() - (this.getSalarioBruto()*this.getImpostos()/100);
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
}
