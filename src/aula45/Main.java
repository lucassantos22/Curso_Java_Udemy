package aula45;

import java.util.Scanner;

public class Main {
	
	public static void main (String[]args) {
		
		double a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as medidas do triângulo X");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		Triangulo t1 = new Triangulo(a,b,c);
	
		System.out.println("Insira as medidas do triângulo Y");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		Triangulo t2 = new Triangulo(a,b,c);
		
		System.out.println("Área de X:" + t1.resgatandoArea());
	
		System.out.println("Área de Y:" + t2.resgatandoArea());
		
		if(t2.resgatandoArea()>t1.resgatandoArea()) {
			System.out.println("A área do triângulo Y é maior que a do triângulo X");		
		}else if(t2.resgatandoArea()<t1.resgatandoArea()) {
			System.out.println("A área do triângulo X é maior que a do triângulo Y");
		}else{
			System.out.println("As duas áreas são iguais!");
		}
		
		sc.close();
		
	}

}
