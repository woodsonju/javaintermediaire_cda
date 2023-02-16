package fr.dawan.javaintermediaire.solid.openclosed.good;

public class Square implements Shape{

	private double cote;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Square(double cote) {
		super();
		this.cote = cote;
	}


	@Override
	public double computeArea() {	
		return cote*cote;
	}

}
