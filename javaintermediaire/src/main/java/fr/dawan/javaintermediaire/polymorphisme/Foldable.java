package fr.dawan.javaintermediaire.polymorphisme;

public interface Foldable {

	/*
	 * A partir de java 8, une interface ne contient plus de méthode 100% abstraite 
	 * Elle peut contenir du code sous deux formes : 
	 * 	- Avec des méthodes statiques 
	 * 	- Avec des méthodes par défaut (default)
	 */
	
	default void toFold() {
		System.out.println("plier....");
	}
	
	void unFold();
	
}
