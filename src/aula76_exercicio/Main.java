package aula76_exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered?");
		int numberEmployees = sc.nextInt();
		
		for(int i=0; i<numberEmployees; i++) {
			int employeeNumber = i + 1;
			System.out.println("Employee #" + employeeNumber);
			System.out.println("Choose an id:");
			Integer id = sc.nextInt();
			System.out.println("Choose an name:");
			String name = sc.next();
			System.out.println("Choose an salary:");
			Double salary = sc.nextDouble();
			Employee e = new Employee(id, name, salary);
			employeeList.add(e);
		}
		
		System.out.println("Enter the employee id that will have the salary increased");
		int idIncreased = sc.nextInt();
		
		System.out.println("Enter the percentage");
		double percentage = sc.nextDouble();
		
		employeeList.get(idIncreased-1).setSalary(employeeList.get(idIncreased-1).getSalary() + employeeList.get(idIncreased).getSalary()*percentage/100);
		
		System.out.println("List of employees");
		for(int i=0; i<numberEmployees; i++) {
			System.out.println(employeeList.get(i).getId() + ", " + employeeList.get(i).getName() + ", " + employeeList.get(i).getSalary());
		}
		
	}

}
