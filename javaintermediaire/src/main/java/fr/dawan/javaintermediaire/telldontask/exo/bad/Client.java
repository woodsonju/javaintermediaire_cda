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
	
	public int doSomethingElse() {
		return (collaborator.getProperty1() * collaborator.getProperty2()
				* collaborator.getProperty3());
	}
	
}
