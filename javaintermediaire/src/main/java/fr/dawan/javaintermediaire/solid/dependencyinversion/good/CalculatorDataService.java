package fr.dawan.javaintermediaire.solid.dependencyinversion.good;

public class CalculatorDataService {
	
	//Couplage faible 
	//definir un contrat(interface) au lieu d'une implémentation
	private IUserRepository userRepository; //null
	
	public CalculatorDataService() {
	}
 
	//Cas 1 : injection par construteur
	/*
	 * Un objet de type CalculatorDataService est crée dans état stable, toutes 
	 * les dépendances sont initialisées. 
	 * Inconvénient : Impossible de changer de dependance; augmente le nombre 
	 * 				  de paramètre du constructeur
	 */
	public CalculatorDataService(IUserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	
	public Object calcultateForUser(long userId) {
		User u = userRepository.findById(userId);
		//traitement sur user 
		return null;  //retourner le résultat
	}

	
	
	//cas 2 : injection par setter/mutateur
	//Lorsqu'on est contraint de le faire (exemple framework)
	//Dépedance modifiable à tout moment 
	//Contraintes : 
	//	- Couplage temporel dans le code appelant 
	//	- S'assurer que la dependance a bien été injectée
	public void setUserRepository(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	//Cas 3 : Injection par paramètre de la méthode 
	//Possibilité faire varier l'instance de la dependance à caque appel de la méthode
	//Contrainte : dépendance à fournir à chaque appel de la méthode
	public Object calculateForUser(long userId, UserRepository repository) {
		User u = userRepository.findById(userId);
		//Traitement sur user 
		return null;  //retourner le resultat
	}


}
