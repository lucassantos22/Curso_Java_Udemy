package course;

import java.util.Scanner;

public class Aula17_EntradaDeDados1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String goodMorning = sc.nextLine();
		String x,y,z;
		x= sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(goodMorning);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();
	}
	
}
