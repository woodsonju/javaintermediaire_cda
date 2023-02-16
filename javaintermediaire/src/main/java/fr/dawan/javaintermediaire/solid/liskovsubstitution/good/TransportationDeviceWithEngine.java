package fr.dawan.javaintermediaire.solid.liskovsubstitution.good;

public abstract class TransportationDeviceWithEngine extends TransportationDevice{

	public void startEngine() {
		System.out.println("Basic engine start functionality");
	}
	
}
