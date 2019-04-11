package aula108_Exercicio;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private Integer hours;
	private double valuePerHour;
	
	public Employee(String name, Integer hours, double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {
		return valuePerHour * hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
}
