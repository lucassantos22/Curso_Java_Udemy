package aula45;

public class Triangulo {
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(double a, double b, double c) {
		this.setLadoA(a);
		this.setLadoB(b);
		this.setLadoC(c);
	}
	
	public double resgatandoArea() {
		double p = ((this.getLadoA() + this.getLadoB() + this.getLadoC())/2);
		return Math.sqrt(this.getLadoA() * (p-this.getLadoA()) * (p-this.getLadoA()) * (p-this.getLadoC()));
	}
	
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double areaA) {
		this.ladoA = areaA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double areaB) {
		this.ladoB = areaB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double areaC) {
		this.ladoC = areaC;
	}

}
