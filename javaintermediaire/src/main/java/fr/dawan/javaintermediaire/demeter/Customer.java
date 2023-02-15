package fr.dawan.javaintermediaire.demeter;

public class Customer {

	private String name;
	
	private Wallet wallet;
	
	public Customer() {
	}

	public Customer(String name, Wallet wallet) {
		super();
		this.name = name;
		this.wallet = wallet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	
	//S'occupe de gérer le paiement 
	public double makePayment(double papperCost) {
		//withdrawal
		return wallet.withdrawal(papperCost);
	}
}
