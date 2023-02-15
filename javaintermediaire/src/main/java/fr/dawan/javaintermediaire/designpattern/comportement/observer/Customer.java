package fr.dawan.javaintermediaire.designpattern.comportement.observer;

public class Customer implements Observer<Double>{
	
	private String name; 
	private double lastObservedPrice;
	
	public Customer() {
	}

	public Customer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Double price) {
		System.out.println(name + " : notification de prix reçue : " + price);
		this.lastObservedPrice = price;
	}

	public double getLastObservedPrice() {
		return lastObservedPrice;
	}
	
	

}
