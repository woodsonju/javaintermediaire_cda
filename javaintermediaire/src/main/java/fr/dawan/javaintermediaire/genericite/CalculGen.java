package fr.dawan.javaintermediaire.genericite;

/**
 * Classe génerique
 * @author Admin stagiaire
 *
 * @param <T>
 */
public class CalculGen<T> {
	public T a;
	public T b;
	
	public CalculGen() {
	}
	
	public CalculGen(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}

	public void permuter() {
		//a = 5 ; b = 10
		//b = 10; a = 5
		T temp = a; 
		a = b; 
		b = temp;
	}
	
	
}
