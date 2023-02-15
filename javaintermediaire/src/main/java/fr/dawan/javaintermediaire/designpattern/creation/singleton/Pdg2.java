package fr.dawan.javaintermediaire.designpattern.creation.singleton;

public class Pdg2 {
	
	/*
	 * L'instance est 'static' afin d'être unique 
	 * volatile = mot-clé utilisé pour marquer une variable afin qu'elle soit stockée 
	 * 			dans le main memory 
	 * garantie que la variable soit visible et manipulable au travers plusieurs Thread
	 */
	private volatile static Pdg2 instance;
	
	private String name;
	
	/*
	 * Le constructeur est privé afin d'éviter que d'autres classes puissent 
	 * instancier un objet de cette classe
	 */
	private Pdg2() {
	}
	
	
	public synchronized  static Pdg2 getInstance(String name) {
		
		if(instance == null) {  			//1
			instance = new Pdg2();			//2	
		}
		
		instance.name = name;
		return instance;					//3
	}


	public String getName() {
		return name;
	}
	
	
	
}
