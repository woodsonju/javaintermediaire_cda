package fr.dawan.javaintermediaire.designpattern.creation.singleton;

public class Pdg3 {
	
	/*
	 * L'instance est 'static' afin d'être unique 
	 * L'instance est 'final' afin de ne jamais être réinstanciée
	 * 
	 * Le singleton est instancié au démarrage de la JVM qui gérera les accès
	 * concurrent une bonne fois pour toutes 
	 */
	private static final Pdg3 instance = new Pdg3();
	
	public String name;
	
	
	/*
	 * Le constructeur est privé afin d'éviter que d'autres classes puissent instancier
	 * un objet de cette classe
	 */
	private Pdg3() {
		
	}
	
	public static Pdg3 getInstance(String name) {
		instance.name = name;
		return Pdg3.instance;
	}

	public String getName() {
		return name;
	}
	
	

}
