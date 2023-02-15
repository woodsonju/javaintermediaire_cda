package fr.dawan.javaintermediaire.dependances.composition;


//Dependance composition/aggregation
//  - un type appartient à l'autre 
//	- Ajout de la responsabilité de création de suppression 
//	- n'impose le fait de connaitre comment instancier l'objet interne b
//	- Composition bloque le partage de composants
//
public class A {
	
	private B b;
	
	public A() {
		//A doit comment construire l'objet B 
		this.b = new B("....");
	}
	
	
}
