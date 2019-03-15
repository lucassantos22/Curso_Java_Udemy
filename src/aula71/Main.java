package aula71;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Room[] rooms = new Room[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented?");
		int roomsQtd = sc.nextInt();
		
		for(int i=0; i<roomsQtd; i++) {
			int actualRoom = i + 1;
			System.out.println("Rent #" + actualRoom);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			rooms[i] = new Room(name, email);
		}
		
		for(int i=0; i<roomsQtd; i++) {
			int actualRoom = i + 1;
			System.out.println(actualRoom + ": " + rooms[i].getName() + ", " + rooms[i].getEmail() );
		}
		
		sc.close();

	}

}
