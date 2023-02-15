package fr.dawan.javaintermediaire.demeter;

public class Wallet {

	private double money;
	
	public Wallet() {
		// TODO Auto-generated constructor stub
	}

	public Wallet(double money) {
		super();
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	
	//withdawal : retrait
	//C'est l'objet Wallet qui a la responsabilité d'effectuer le retrait 
	public double withdrawal(double paperCost) {
		if(this.money >= paperCost) {
			money -= paperCost;
			return paperCost;
		}
		
		return 0; //TO DO ajouter un historique des personnes 
	}
}
