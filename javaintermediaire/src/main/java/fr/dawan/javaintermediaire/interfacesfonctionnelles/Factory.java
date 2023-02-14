package fr.dawan.javaintermediaire.interfacesfonctionnelles;

/**
 * S'occupe de nous créer un Objet Name
 * @author Admin stagiaire
 *
 */
public class Factory {

	public static Name createName(String fn, String ln) {
		return new Name(fn, ln);
	}
	
}
