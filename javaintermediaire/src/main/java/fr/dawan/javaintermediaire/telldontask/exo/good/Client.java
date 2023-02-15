package fr.dawan.javaintermediaire.telldontask.exo.good;

public class Client {

	private int clientInternalDetail1;
	private int clientIternalDetail2;
	
	private Collaborator collaborator;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(Collaborator collaborator) {
		super();
		this.collaborator = collaborator;
	}
	
	//La classe Client délègue le calcul à la classe Collaborateur 
	//Il ne connait plus les propriétes de classe Collaborateur
	public int doSomethingElse() {
		return collaborator.calculateSomething();
	}
	
	
}
