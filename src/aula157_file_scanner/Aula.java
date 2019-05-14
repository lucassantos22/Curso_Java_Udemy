package aula157_file_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\test.txt");
		
		try (Scanner sc = new Scanner(file)){
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("[ERRO] Arquivo não encontrado");
		}
		
	}

}
