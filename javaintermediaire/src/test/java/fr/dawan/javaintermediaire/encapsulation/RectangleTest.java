package fr.dawan.javaintermediaire.encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {
	
	@Test
	void testGetArea() {
		Rectangle rec = new Rectangle(10l, 14l);
		long area = rec.getArea();
		assertEquals(140, area);
	}
	
	@Test
	void testRedim() {
		Rectangle rec = new Rectangle(10l, 14l);
		
		//Junit 5 Jupiter introduit la méthode assertThrows pour les exceptions
		//Cela prend le type de l'exception attendue  et une interface fonctionnelle 
		//exécutable où nous pouvons passer le code sous test via une expression 
		//lambda
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
		rec.redim(-5l, 25l); });
		
		String expectedMessage = "Length can't be negative !";
		String actualMessage = exception.getMessage();
		
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
