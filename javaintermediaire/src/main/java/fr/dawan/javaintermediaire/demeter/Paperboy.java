package fr.dawan.javaintermediaire.demeter;

import java.util.List;

public class Paperboy {
	
	private List<Customer> customers;
	
	private double collectedFunds;
	
	public Paperboy() {
		// TODO Auto-generated constructor stub
	}

	public Paperboy(List<Customer> customers) {
		super();
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public double getCollectedFunds() {
		return collectedFunds;
	}

	public void setCollectedFunds(double collectedFunds) {
		this.collectedFunds = collectedFunds;
	}
	
	/*
	 * Ce code fonctione bien mais il pose un problème : 
	 * La classe Paperboy viole la loi Demeter  car elle a accès aux données 
	 * Wallet par l'intermédiaire de l'objet Customer (car elle utilise la 
	 * méthode getMoney)
	 * 
	 * Problème : 
	 * En cas de changement de la classe Wallet (si on renomme Money par exemple), 
	 * cela aurait un cimpact sur la méthode collectedPayments
	 * 
	 * Solution : L'objet Paperboy ne devrait parler qu'avec ses amis(ici Customer)
	 * 
	 */
//	public void collectedPayments() {
//		double paperCost = 1; //le journal coûte 1 euro	
//		for (Customer customer : customers) {
//			if(customer.getWallet().getMoney() >= paperCost) {
//				customer.getWallet()
//				.setMoney(customer.getWallet().getMoney() - paperCost);
//				collectedFunds += paperCost;
//			}
//		}
//	}
	
	
	
	//CODE PROPRE
	public void collectedPayments() {
		double paperCost = 1; //le journal coûte 1 euro	
		for (Customer customer : customers) {
			double payment = customer.makePayment(paperCost);
			if(payment != 0) {
				collectedFunds += payment;
			}
		}
	}

}
