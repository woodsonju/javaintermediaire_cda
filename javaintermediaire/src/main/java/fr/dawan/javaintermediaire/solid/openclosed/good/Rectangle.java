package fr.dawan.javaintermediaire.solid.openclosed.good;

public class Rectangle implements Shape{

	private double length;
	private double width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	@Override
	public double computeArea() {
		return this.width * this.length;
	}

}
