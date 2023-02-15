package fr.dawan.javaintermediaire.designpatter.creation.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.designpattern.creation.factory.Circle;
import fr.dawan.javaintermediaire.designpattern.creation.factory.Rectangle;
import fr.dawan.javaintermediaire.designpattern.creation.factory.Shape;
import fr.dawan.javaintermediaire.designpattern.creation.factory.ShapeFactory;

public class FactoryTest {
	
	private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	
	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStream));
	}
	
	@Test
	void testFactory1() {
		
		Shape sh1 = new Rectangle();
		Shape sh2 = new Circle();
		
		//On souhaite avoir usine qui contient une méthode 
		//pour nous fabriquer des objets
		Shape sh3 =  ShapeFactory.getShape("Circle");
		
		sh3.draw();
		
		assertEquals("Inside Circle :: draw() method", outputStream.toString().trim());
		
	}
	
	
	@Test
	void testFactory2() {
		try {
			Shape sh1 = ShapeFactory.getShape(Rectangle.class); 
			assertNotNull(sh1);
		} catch (Exception e) {
			fail("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
