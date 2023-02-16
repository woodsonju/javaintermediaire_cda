package fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability;

import fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability.ComplaintRequest.ComplaintState;

public class Teacher extends Staff{
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	

	public Teacher(String name, Staff successor) {
		super(name, successor);
		// TODO Auto-generated constructor stub
	}


	//La demande est gérée par l'objet Prof, s'il ne peut pas traiter la requête 
	//Il l'a transmet à l'objet suivant dans la chaine (si l'objet suivant est 
	//différent de null
	@Override
	public void handleComplaint(ComplaintRequest req) {
		if(req.getComplaintType() == 1) {
			System.out.println("Votre req a été traité par le prof");
			req.setState(ComplaintState.CLOSED);
		} else if (successor != null) {
			System.out.println("Prof a remonté la demande au successeur");
			successor.handleComplaint(req);
		}
		
	}

}
