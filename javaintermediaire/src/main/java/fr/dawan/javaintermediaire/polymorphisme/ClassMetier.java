package fr.dawan.javaintermediaire.polymorphisme;

public class ClassMetier {
	
	//Le polymorphisme nous permet de nous concentrer sur ce qui doit être fait, 
	//plutôt que sur qui va le faire
	
	//Il y a plusieurs façon d'utiliser le polymorphisme 
	
	//ad-hoc (eviter)
	//ad-hoc (mise en place du polymorphisme au niveau des méthodes avec intanceof)
	public static void buy(Object f) {
		if(f instanceof Foldable) {
			Foldable foldable = (Foldable) f;
			foldable.unFold();
		}
	}
	
	
	//Polymorphisme par sous-typage 
	public  static void buy(Foldable f) {
		//Pas besoin de vérifier le type à chaque fois
		f.unFold();
	}
	
	//Polymorphisme par type paramétique (génériques)
	//Paramètre generic avec contraintes 
	//Contrainte sur les variable de type
	public static <T extends Foldable> void buy2(T f) {
		//Pas besoin de vérifier le type à chaque fois
		f.unFold();
	}
	
	
}
