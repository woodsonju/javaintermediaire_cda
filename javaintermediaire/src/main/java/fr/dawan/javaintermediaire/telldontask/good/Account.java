package fr.dawan.javaintermediaire.telldontask.good;

public class Account {

	private int id;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdrawal(float amount) {
		if(balance < amount) {
			throw new IllegalArgumentException("Error : not enough money ! ");
		}
		balance -= amount;
	}
	
}
