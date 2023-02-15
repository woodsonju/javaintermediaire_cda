package fr.dawan.javaintermediaire.telldontask.exo.good;

public class Collaborator {

	private int property1; 
	private int property2; 
	private int property3;
	
	public Collaborator() {
		// TODO Auto-generated constructor stub
	}

	public Collaborator(int property1, int property2, int property3) {
		super();
		this.property1 = property1;
		this.property2 = property2;
		this.property3 = property3;
	}

	public int getProperty1() {
		return property1;
	}

	public void setProperty1(int property1) {
		this.property1 = property1;
	}

	public int getProperty2() {
		return property2;
	}

	public void setProperty2(int property2) {
		this.property2 = property2;
	}

	public int getProperty3() {
		return property3;
	}

	public void setProperty3(int property3) {
		this.property3 = property3;
	}
	
	public int calculateSomething() {
	return (this.property1 * this.property2)
			+ this.property3;
}
	
}
