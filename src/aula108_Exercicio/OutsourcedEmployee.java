package aula108_Exercicio;

public class OutsourcedEmployee extends Employee{
	
	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return (getValuePerHour() * getHours()) + getAdditionalCharge();
	}

	private double additionalCharge;

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
}
