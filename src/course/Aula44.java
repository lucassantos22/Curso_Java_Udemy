package course;

import java.util.Scanner;

public class Aula44 {
	
	public static void main (String[]args) {
		
		double xA, xB, xC, yA, yB, yC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira as medidas do triângulo X");
		
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
	
		System.out.println("Insira as medidas do triângulo Y");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double pX = ((xA + xB + xC)/2);
		double areaX = Math.sqrt(pX * (pX-xA) * (pX-xB) * (pX-xC));
		
		System.out.println("Área de X:" + areaX);
	
		double pY = ((yA + yB + yC)/2);
		double areaY = Math.sqrt(pY * (pY-yA) * (pY-yB) * (pY-yC));
		
		System.out.println("Área de Y:" + areaY);
		
		if(areaY>areaX) {
			System.out.println("A área do triângulo Y é maior que a do triângulo X");		
		}else if(areaY<areaX) {
			System.out.println("A área do triângulo X é maior que a do triângulo Y");
		}else{
			System.out.println("As duas áreas são iguais!");
		}
		
		sc.close();
		
	}

}
