package fr.dawan.javaintermediaire.designpatter.creation.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.designpattern.creation.singleton.Pdg;
import fr.dawan.javaintermediaire.designpattern.creation.singleton.Pdg3;

class PdgTest {


	@Test
	void testGetInstance() {
		Pdg p1 = Pdg.getInstance("Toto");
		Pdg p2 = Pdg.getInstance("Titi");
		System.out.println(p1);
		System.out.println(p2);
		
		assertTrue(p1 == p2);
		assertEquals(p1.getName(), "Titi");
		assertEquals(p2.getName(), "Titi");
		
	}
	
	@Test
	void testGetInstanceAvecFinal() {
		Pdg3 p1 = Pdg3.getInstance("Toto");
		Pdg3 p2 = Pdg3.getInstance("Titi");
		
		assertTrue(p1 == p2);
		assertEquals(p1.getName(), "Titi");
		assertEquals(p2.getName(), "Titi");
		
		
	}

}
