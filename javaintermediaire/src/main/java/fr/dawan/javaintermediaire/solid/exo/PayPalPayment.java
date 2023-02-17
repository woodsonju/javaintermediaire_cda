package fr.dawan.javaintermediaire.solid.exo;

public class PayPalPayment implements Payment{

	private String email;
	public String password;
	
	public PayPalPayment() {
	}
	
	public PayPalPayment(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	@Override
	public boolean pay(double amount) {
		// process the payment with PayPal
		return true;
	}

}
