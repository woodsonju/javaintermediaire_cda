package fr.dawan.javaintermediaire.telldontask.exo.bad;

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
	
	/*
	 * Cette méthode n'utilise aucun état interne de la classe Client, 
	 * Mais plutot les etats de la classe Collaborateur 
	 *La classe Client fait beaucoup de "DEMANDE" alors qu'il pourrait 
	 *"DIRE" à la classe collaborateur quoi faire
	 */
	public int doSomethingElse() {
		return (collaborator.getProperty1() * collaborator.getProperty2()
				+ collaborator.getProperty3());
	}
	
}
