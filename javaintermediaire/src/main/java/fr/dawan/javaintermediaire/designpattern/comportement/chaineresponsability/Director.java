package fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability;

import fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability.ComplaintRequest.ComplaintState;

public class Director extends Staff {

	public Director() {
		// TODO Auto-generated constructor stub
	}
	

	public Director(String name, Staff successor) {
		super(name, successor);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void handleComplaint(ComplaintRequest req) {
		
		System.out.println("Votre req " + req.getMessage() + " a été traité par le directeur");
		req.setState(ComplaintState.CLOSED);
	}

}
