package aula162_caminho_arquivo;

import java.io.File;
import java.util.Scanner;

public class Aula162 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path:");
		
		String filePath = sc.nextLine();
		
		try {
			File file = new File(filePath);
			System.out.println("Nome: " + file.getName());
			System.out.println("Caminho sem nome: " + file.getParent());
			System.out.println("Caminho completo: " + file.getPath());
		}catch (Exception e) {
			System.out.println("Caminho não achado.");
		}
		
		sc.close();
		
	}

}
