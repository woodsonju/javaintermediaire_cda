package fr.dawan.javaintermediaire.genericite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculGenTest {


	@Test
	void testPermuterEntier() {
		CalculGen<Integer> c1 = new CalculGen<Integer>();
		c1.a = 10;
		c1.b = 40;
		c1.permuter();
		
		assertEquals(40, c1.a);
		assertEquals(10, c1.b);
	}
	
	@Test
	void testPermuterDouble() {
		CalculGen<Double> c1 = new CalculGen<Double>();
		c1.a = 5.5;
		c1.b = 13.4;
		c1.permuter();
		
		assertEquals(13.5, c1.a);
		assertEquals(5.5, c1.b);
	}
	

	@Test
	void testPermuterString() {
		CalculGen<String> c1 = new CalculGen<String>();
		c1.a = "Dawan";
		c1.b = "Jehann";
		c1.permuter();
		
		assertEquals("Jehann", c1.a);
		assertEquals("Dawan", c1.b);
	}
	

}
