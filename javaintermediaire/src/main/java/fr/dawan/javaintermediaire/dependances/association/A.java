package fr.dawan.javaintermediaire.dependances.association;


//dependance de  type "Association" 
//s'étend sur toute la durée de vie d'un objet 
//influence également la construction de l'objet
//l'ensemble des métodes est partagée
public class A {

	private B b;
	
	public A (B b) {
		this.b = b;
	}
	
}

