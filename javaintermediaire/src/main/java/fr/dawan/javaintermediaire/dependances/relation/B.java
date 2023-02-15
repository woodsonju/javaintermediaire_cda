package fr.dawan.javaintermediaire.dependances.relation;

//Dependance "Relation"
//La plus faible forme de dépendance entre objets 
//limitée dans le temps ? ==> oui (exécution d'une méthode)
//limitée à du code partagé
public class B {
	
	public void methodWithParam(A a) {
		a.methodA();
	}
	
	public A methodThatReturnA() {
		return new A();
	}

}
