package fr.dawan.javaintermediaire.dto;

/*
 * Si la couche presentation a besoin de manipuler les données suivantes : 
 * 	Le nom, le prenom du client et sont solde de compte 
 * 	On va créer un DTO que pour ces données
 */
public class CustomerDto {

	private String customerFirstName;
	private String customerLastName;
	private float AccountBalance;  //solde du compte
	
	public CustomerDto() {
	}

	public CustomerDto(String customerFirstName, String customerLastName, float accountBalance) {
		super();
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		AccountBalance = accountBalance;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public float getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		AccountBalance = accountBalance;
	}
	
	
	
}
