package fr.dawan.javaintermediaire.genericite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculTest {

	@Test
	void testPermuterEntier() {
		Calcul c1 = new Calcul();
		c1.a = 10;
		c1.b = 40;
		c1.permuter();
		
		assertEquals(40, c1.a);
		assertEquals(10, c1.b);
	}
	
	@Test
	void testPermuterDouble() {
		Calcul c1 = new Calcul();
		c1.a = (int) 5.5;
		c1.b = (int) 13.4;
		c1.permuter();
		
		assertEquals(13.5, c1.a);
		assertEquals(5.5, c1.b);
	}
	
	//Type incompatible
//	@Test
//	void testPermuterString() {
//		Calcul c1 = new Calcul();
//		c1.a = "Dawan"
//		c1.b = "Jehann";
//		c1.permuter();
//		
//		assertEquals("Jehann", c1.a);
//		assertEquals("Dawan", c1.b);
//	}
	
	
}
