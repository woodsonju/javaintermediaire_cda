package fr.dawan.javaintermediaire.solid.liskovsubstitution.bad;

public class Bicycle extends TransportationDevice{

	@Override
	public void startEngine() {

		/*
		 * Pb : On ne peut implemeter cette méthode
		 *		pas de moteur dans cet objet
		 */
		throw new RuntimeException("Pas de moteur pour l'objet " + this.getClass().getSimpleName());
		
	}

	@Override
	public void startMovement() {
		System.out.println("Le mouvement du vélo a commencé");
		
	}
	
	/*
	 * principe de Liskov : 
	 * un objet x d'un sous-type de TransportationDevice 
	 * peut remplacer un objet de TransportationDevice
	 * 
	 * TransportationDevice c = new Bicycle(); 
	 * c.startEngine();
	 * .....
	 */

}
