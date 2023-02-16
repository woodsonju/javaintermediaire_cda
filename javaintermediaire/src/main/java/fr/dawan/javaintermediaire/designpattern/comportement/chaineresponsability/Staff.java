package fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability;

//Handler
public abstract  class Staff {

	//nom du handler (Teacher, PedagDirector, Director)
	protected String name;
	
	//Le handler suivant dans la chaine
	protected Staff successor;
	
	public Staff() {
	}

	public Staff(String name, Staff successor) {
		super();
		this.name = name;
		this.successor = successor;
	}
	
	//Methode permettant de gerer la demande
	public abstract void handleComplaint(ComplaintRequest req);
}
