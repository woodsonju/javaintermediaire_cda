package fr.dawan.javaintermediaire.solid.openclosed;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.solid.openclosed.good.Rectangle;
import fr.dawan.javaintermediaire.solid.openclosed.good.Shape;
import fr.dawan.javaintermediaire.solid.openclosed.good.Square;

class ShapeTest {

	@Test
	void testAreaRec() {
		Shape rec = new Rectangle(10, 5);
		double recArea = rec.computeArea();
		assertEquals(50, recArea);
	}

	@Test
	void testAreaSquare() {
		Shape square = new Square(2);
		double squareArea = square.computeArea();
		assertEquals(4, squareArea);
	}

}
