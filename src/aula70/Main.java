package aula70;

public class Main {

	public static void main(String[] args) {
		
		Produto p[] = new Produto[4];
		
		p[0] = new Produto("TV", 3100.90);
		p[1] = new Produto("Celular", 2399.90);
		p[2] = new Produto("iPad", 1890.90);
		p[3] = new Produto("Fone de ouvido", 21.90);
		
		double precos[] = new double[p.length];
		
		for(int i=0; i<precos.length; i++) {
			precos[i] = p[i].getPreco();
		}
		
		double valorTotalDosPrecos = 0;
		for(int i=0; i<precos.length; i++) {
			valorTotalDosPrecos += precos[i];
		}
		
		double mediaDosPrecos = valorTotalDosPrecos/4;
		
		System.out.println("Média dos preços");
		System.out.println(mediaDosPrecos);
		
	}

}
