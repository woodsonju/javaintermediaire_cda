package fr.dawan.javaintermediaire.solid.openclosed.good;

public class Circle implements Shape{
	
	private double radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	

}
