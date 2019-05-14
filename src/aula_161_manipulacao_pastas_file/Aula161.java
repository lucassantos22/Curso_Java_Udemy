package aula_161_manipulacao_pastas_file;

import java.io.File;
import java.util.Scanner;

public class Aula161 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String folderPath = sc.nextLine();
		
		try {
			File path = new File(folderPath);
			File[] folders = path.listFiles(File::isDirectory);
			
			for(File folder : folders) {
				System.out.println(folder);
			}
		}catch (Exception e) {
			System.out.println("Arquivo não encontrado.");
		}finally {
			sc.close();
		}
		
	}

}
