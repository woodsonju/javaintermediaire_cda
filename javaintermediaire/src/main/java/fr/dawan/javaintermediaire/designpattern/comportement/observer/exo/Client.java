package fr.dawan.javaintermediaire.designpattern.comportement.observer.exo;

public class Client implements Observer{
	
	private String name;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	public Client(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Subject subject) {

		System.out.println("Notification pour " + name + ": Le solde de la banque : "
				+ ((Bank) subject).getName() + " est de " + 
				((Bank) subject).getBalance());
		
	}
	
	

}
