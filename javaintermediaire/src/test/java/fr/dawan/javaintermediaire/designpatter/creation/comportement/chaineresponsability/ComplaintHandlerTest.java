package fr.dawan.javaintermediaire.designpatter.creation.comportement.chaineresponsability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability.ComplaintRequest;
import fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability.ComplaintRequest.ComplaintState;
import fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability.Director;
import fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability.PedagDirector;
import fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability.Teacher;

class ComplaintHandlerTest {


	@Test
	void testHandle() {
		//Créer un objet teacher qui doit traiter la demande 
		Teacher t1 = new Teacher("prof1", 
					new PedagDirector("DirPed1", 
					new Director("DirecteurGen", null)));
		
		//1 :Teacher, 2: PedagDirector, 3: Directeur
		
		//La demande est traitée par le Teacher 
		t1.handleComplaint(new ComplaintRequest(123, 1, "req", ComplaintState.OPENED));
		System.out.println("----------------------------------------");
		
		//La demande est traitée par le directeur
		t1.handleComplaint(new ComplaintRequest(123, 3, "req2", ComplaintState.OPENED));
		System.out.println("----------------------------------------");


		//La demande est traitée par le PedagDirector
		t1.handleComplaint(new ComplaintRequest(123, 2, "req3", ComplaintState.OPENED));
		System.out.println("----------------------------------------");

	}

}
