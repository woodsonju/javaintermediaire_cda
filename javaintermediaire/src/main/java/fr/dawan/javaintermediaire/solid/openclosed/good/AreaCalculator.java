package fr.dawan.javaintermediaire.solid.openclosed.good;

//On respecte le principe de Open/Closed
public class AreaCalculator {
	
	public double computeArea(Shape shape) {
		return shape.computeArea();
	}
	

}
