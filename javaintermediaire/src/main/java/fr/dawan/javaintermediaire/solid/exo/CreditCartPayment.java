package fr.dawan.javaintermediaire.solid.exo;

public class CreditCartPayment implements Payment {
	
	private String cardNumber;
	private String cvv;
	private String expirationDate;
	
	public CreditCartPayment() {
	}
	
	
	public CreditCartPayment(String cardNumber, String cvv, String expirationDate) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expirationDate = expirationDate;
	}


	@Override
	public boolean pay(double amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
