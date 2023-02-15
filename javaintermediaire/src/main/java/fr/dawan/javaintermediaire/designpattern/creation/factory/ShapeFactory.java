package fr.dawan.javaintermediaire.designpattern.creation.factory;

import java.lang.reflect.InvocationTargetException;

/**
 * Rôle de cette classe est de construire de nouvelles formes géométrique
 * 
 * @author Admin stagiaire
 *
 */
public class ShapeFactory {

	
	public static <T> Shape getShape(Class<? extends Shape> clazz) throws Exception {
		return clazz.getConstructor().newInstance(); // Appeler le constructeur sans param
	}

	// getShape("circle")
	public static Shape getShape(String shapeType) {
		
		shapeType = shapeType.toLowerCase();
		
		if(shapeType == null) {
			return null;
		}
		
		switch (shapeType) {
		case "circle": {
			return new Circle();
		}
		case "rectangle": {
			return new Rectangle();
		}
		case "square": {
			return new Square();
		}
		
	}
		return null;
	
	}
}
