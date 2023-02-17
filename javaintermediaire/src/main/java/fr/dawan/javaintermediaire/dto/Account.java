package fr.dawan.javaintermediaire.dto;

public class Account {
	
	private String number; 
	private float balance; 
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String number, float balance) {
		super();
		this.number = number;
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}
