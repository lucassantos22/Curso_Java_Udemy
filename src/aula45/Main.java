package aula45;

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
		double a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as medidas do tri�ngulo X");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		Triangulo t1 = new Triangulo(a,b,c);
	
		System.out.println("Insira as medidas do tri�ngulo Y");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		Triangulo t2 = new Triangulo(a,b,c);
		
		System.out.println("�rea de X:" + t1.resgatandoArea());
	
		System.out.println("�rea de Y:" + t2.resgatandoArea());
		
		if(t2.resgatandoArea()>t1.resgatandoArea()) {
			System.out.println("A �rea do tri�ngulo Y � maior que a do tri�ngulo X");		
		}else if(t2.resgatandoArea()<t1.resgatandoArea()) {
			System.out.println("A �rea do tri�ngulo X � maior que a do tri�ngulo Y");
		}else{
			System.out.println("As duas �reas s�o iguais!");
		}
		
		sc.close();
		
	}

}
