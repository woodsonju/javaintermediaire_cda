package fr.dawan.javaintermediaire.solid.liskovsubstitution.good;

public class Car extends TransportationDeviceWithEngine {

	@Override
	public void startEngine() {
		super.startEngine();
		System.out.println("Starting engine of car");
	}

	@Override
	public void startMoving() {
		System.out.println("Movement of Car started");
		
	}

	
	

}
