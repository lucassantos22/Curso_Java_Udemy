package aula108_Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employees");
		int employeeNumbers = sc.nextInt();
		
		for(int i=0; i<employeeNumbers; i++) {
			int employeeNubmer = i + 1;
			System.out.println("Employee #" + employeeNubmer);
			System.out.println("Outsourced (y/n)?");
			char outsourced = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(outsourced == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				OutsourcedEmployee outsorcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(outsorcedEmployee);
			}else{
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
			}
		}
		
		System.out.println("PAYMENTS:");
		for(int i=0; i<employees.size(); i++) {
			System.out.println(employees.get(i).getName() + " - " + "$ " +employees.get(i).payment());
		}
			
		sc.close();
		
	}

}
