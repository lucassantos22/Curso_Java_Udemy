package aula50;

public class Rectangle {
	
	private double width;
	private double heigth;
	
	public Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	public double Area() {
		return this.heigth * this.width;
	}
	
	public double Perimeter() {
		return 2*(this.width + this.heigth);
	}
	
	public double Diagonal() {
		return Math.sqrt((this.width*this.width)+(this.heigth*this.heigth));
	}

}
