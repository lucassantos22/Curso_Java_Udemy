package course;

import java.util.Locale;

public class SaidaDados {
	public static void main (String[]args) {
		
		System.out.print("Good morning!");
		System.out.println("Good afternoon!");
		System.out.println("Good night!");
		System.out.printf("%.2f%n", 10.9489); //%n faz quebrar a linha
		System.out.printf("%.3f", 10.9489);
//		Locale.setDefault(Locale.US); Setar localização (Afetará padrões de linguagem)
	}
}
