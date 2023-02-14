package fr.dawan.javaintermediaire.interfacesfonctionnelles;

public class NameParser<T> {
	
	/*
	 * On delègue au creator la creation de l'objet retourné
	 * Vu que Creator<T> est une interface fonctionnelle, 
	 * on pourra appeler la méthode parse avec une expression 
	 * lambda 
	 */
	public T parse(String fullName, Creator<T> creator) {
		String[] tokens = fullName.split(" ");  // Jacques Célaire  ==> [Jacques Célaire]
		return creator.create(tokens[0], tokens[1]);
	}

}
