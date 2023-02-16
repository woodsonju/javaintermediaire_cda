package fr.dawan.javaintermediaire.solid.dependencyinversion.bad;


//CalculatorDataService depend de UserRepository 
//Si on souhaite respecter un des principes solid : Dependency Injection 
//3 maniere pour l'injection de dependances : 
//par constructeur, propriété ou mutateur (setter) 
//Favoriser l'injection par constructeur dans un premier temps
public class CalculatorDataService {
	
	//Méthode qui fait un traitement pour un user donné
	//Un code sans injection de la dependance UserRepository, la dépendance 
	//est instanciée dans la méthode
	public Object calcultateForUser(long userId) {
		UserRepository repo = new UserRepository();   
		User u = repo.findById(userId);
		//traitement
		return null;  //retourner le resultat
	}
	
}
