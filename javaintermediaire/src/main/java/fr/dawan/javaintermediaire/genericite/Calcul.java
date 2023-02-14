package fr.dawan.javaintermediaire.genericite;

public final class Calcul {

	public int a;
	public int b;
	
	public Calcul() {
	}
	
	public Calcul(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

	public void permuter() {
		//a = 5 ; b = 10
		//b = 10; a = 5
		int temp = a; 
		a = b; 
		b = temp;
	}
	
}
