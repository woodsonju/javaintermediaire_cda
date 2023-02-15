package fr.dawan.javaintermediaire.designpattern.creation.singleton;

public class Pdg {
	
	/*
	 * L'instance est 'static' afin d'être unique 
	 */
	private static Pdg instance;
	
	private String name;
	
	/*
	 * Le constructeur est privé afin d'éviter que d'autres classes puissent 
	 * instancier un objet de cette classe
	 */
	private Pdg() {
	}
	
	
	public static Pdg getInstance(String name) {
		
		if(instance == null) {  			//1
			instance = new Pdg();			//2	
		}
		
		instance.name = name;
		return instance;					//3
	}


	public String getName() {
		return name;
	}
	
	
	
}
