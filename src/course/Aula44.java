package course;

import java.util.Scanner;

public class Aula44 {
	
	public static void main (String[]args) {
		
		double xA, xB, xC, yA, yB, yC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as medidas do tri�ngulo X");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
	
		System.out.println("Insira as medidas do tri�ngulo Y");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double pX = ((xA + xB + xC)/2);
		double areaX = Math.sqrt(pX * (pX-xA) * (pX-xB) * (pX-xC));
		
		System.out.println("�rea de X:" + areaX);
	
		double pY = ((yA + yB + yC)/2);
		double areaY = Math.sqrt(pY * (pY-yA) * (pY-yB) * (pY-yC));
		
		System.out.println("�rea de Y:" + areaY);
		
		if(areaY>areaX) {
			System.out.println("A �rea do tri�ngulo Y � maior que a do tri�ngulo X");		
		}else if(areaY<areaX) {
			System.out.println("A �rea do tri�ngulo X � maior que a do tri�ngulo Y");
		}else{
			System.out.println("As duas �reas s�o iguais!");
		}
		
		sc.close();
		
	}

}
