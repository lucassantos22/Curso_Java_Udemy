package aula_160_filewriter_bufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aula {

	public static void main(String[] args) {

		String[] lines = {"Good morning", "Good afternoon", "Good night"};
		
		File file = new File("C:\\temp\\testCriado.txt");
		
		try (BufferedWriter bf = new BufferedWriter(new FileWriter(file, true))){
			for(String line: lines) {
				bf.write(line);
				bf.newLine();
			}
			System.out.println("Arquivo criado/editado");
		} catch (IOException e) {
			System.out.println("[Erro] - " + e);
		}
		
	}

}
