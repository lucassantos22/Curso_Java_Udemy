package aula97_exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Worker worker = new Worker();
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department name: ");
		
		String departmentName = sc.nextLine();
		Department department = new Department(departmentName);
		worker.setDepartment(department);
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		
		String name = sc.nextLine();
		worker.setName(name);
		
		System.out.print("Level: ");
		
		String level = sc.nextLine();
		worker.setLevel(WorkerLevel.valueOf(level));
		
		System.out.print("Base salary: ");
		
		Double salary = sc.nextDouble();
		worker.setSalary(salary);
		
		System.out.print("How many contracts this worker has? ");
		int numberOfContracts = sc.nextInt();
		
		for(int i=0; i<numberOfContracts; i++) {
			int contractNumber = i+1;
			System.out.println("ENTER CONTRACT #" + contractNumber + " DATA");
			System.out.print("Date (DD/MM/YYYY): ");
			String date = sc.next();
			Date contractDate = null;
			try {
				contractDate = sdf.parse(date);
			} catch (ParseException e) {
				System.out.println("Insira um formato de data válido");
			}
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duration (Hours): ");
			int duration = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.print("Enter year and month to calculate the income (MM/YYYY):");
		String monthYear = sc.next();
		
		String[] monthYearList = monthYear.split("/");
		Double income = worker.income(Integer.parseInt(monthYearList[0]), Integer.parseInt(monthYearList[1]));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthYear + ": " + income);
		
		sc.close();
		
		
	}

}
