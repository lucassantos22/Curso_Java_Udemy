package aula50;

public class Main {
	
	public static void main(String[]args) {
		
		Rectangle r1 = new Rectangle(3.5,2.3);
		System.out.println(r1.Area());
		System.out.println(r1.Diagonal());
		System.out.println(r1.Perimeter());
		
		Funcionario f1 = new Funcionario("Lucas",20000,1000);
		System.out.println(f1.salarioLiquido());
		f1.acrescentarSalario(10);
		System.out.println(f1.salarioLiquido());
		
		Aluno a1 = new Aluno("Lucas",30,35,35);
		System.out.println(a1.boletim());
		
		Aluno a2 = new Aluno("Jordan",10,20,18);
		System.out.println(a2.boletim());
	}
}
