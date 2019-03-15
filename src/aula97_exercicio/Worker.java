package aula97_exercicio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double salary;
	private Department department;
	private List<HourContract> contracts;
	
	public Worker() {
		contracts = new ArrayList();
	}

	public Worker(String name, WorkerLevel level, Double salary, Department department) {
		this();
		this.name = name;
		this.level = level;
		this.salary = salary;
		this.department = department;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = salary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c: contracts) {
			cal.setTime(c.getDate());
			if(cal.get(Calendar.MONTH + 1) == month &&  cal.get(Calendar.YEAR) == year) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public WorkerLevel getLevel() {
		return level;
	}
	
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

}