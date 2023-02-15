package fr.dawan.javaintermediaire.designpattern.comportement.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject<Double> {
	
	private String description;
	private double price;
	
	private List<Observer<Double>> observers;
	
	public Product() {
	}
	
	public Product(String description, double price) {
		super();
		this.description = description;
		this.price = price;
		observers = new ArrayList<>();
	}
	
	

	/**
	 * Enregistrer un observer
	 */
	@Override
	public void attach(Observer<Double> obs) {
		observers.add(obs);
		
	}

	
	/**
	 * Supprimer un observer
	 */
	@Override
	public void detach(Observer<Double> obs) {
		observers.remove(obs);
	}

	
	/**
	 * Notifier les observateurs lorsqu'un événement se produit 
	 * Ici, lorsque le prix du produit change 
	 * on notifie les observateurs de ce changements
	 */
	@Override
	public void notify(Double obj) {
		observers.forEach((obs) -> obs.update(obj));
	}

	/**
	 * Lorsque le prix change on notifie les observateurs 
	 * de cette modification
	 * @param price
	 */
	public void changePrice(double price) {
		this.price = price;
		notify(price);
	}

	public double getPrice() {
		return price;
	}
	
	

}
