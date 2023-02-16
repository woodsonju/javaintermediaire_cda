package fr.dawan.javaintermediaire.solid.liskovsubstitution.bad;

public class Car extends TransportationDevice {

	@Override
	public void startEngine() {
		System.out.println("Engine of Car started");
		
	}

	@Override
	public void startMovement() {
		System.out.println("Movement of Car started");
	}

}
