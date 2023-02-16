package fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability;

import fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability.ComplaintRequest.ComplaintState;

public class PedagDirector extends Staff{
	
	public PedagDirector() {
		// TODO Auto-generated constructor stub
	}
	
	

	public PedagDirector(String name, Staff successor) {
		super(name, successor);
		// TODO Auto-generated constructor stub
	}


	//La demande est gérée par l'objet PedagDirector, s'il ne peut pas 
	//traiter la requête il l'a transmet à l'objet suivant dans la chaine 
	@Override
	public void handleComplaint(ComplaintRequest req) {

		if(req.getComplaintType() == 2) {
			System.out.println("Votre req a été traitée par le PedagDirector");
			req.setState(ComplaintState.CLOSED);
		} else if(successor != null) {
			System.out.println("PedagDirector a remonté la demande au successeur");
			successor.handleComplaint(req);
		}
		
	}

}
