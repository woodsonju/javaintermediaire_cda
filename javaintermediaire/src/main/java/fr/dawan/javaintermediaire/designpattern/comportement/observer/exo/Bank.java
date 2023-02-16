package fr.dawan.javaintermediaire.designpattern.comportement.observer.exo;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Subject{
	
	private String name;
	private double balance;
	private List<Observer> observers;
	
	public Bank() {
	}
	
	 
	public Bank(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
		observers = new ArrayList<>();
	}


	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(this));
	}
	
	public void deposit(double amount) {
		balance += amount;
		notifyObservers();
	}
	
	public void withdraw(double amount) {
		if(amount < balance) {
			balance -= amount;
			notifyObservers();
		}
	}
	
	


	public String getName() {
		return name;
	}


	public double getBalance() {
		return balance;
	}
	
	

}
