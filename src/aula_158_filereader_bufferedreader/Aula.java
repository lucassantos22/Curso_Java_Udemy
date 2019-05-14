package aula_158_filereader_bufferedreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Aula {

	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\test.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file));){
			
			String line = br.readLine();
			
			while(line!=null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}catch (IOException e) {
			System.out.println("[ERRO] - " + e.getMessage());
		}
			
	}

}
