package fr.dawan.javaintermediaire.solid.liskovsubstitution.good;

public class Bicycle extends TransportDeviceWithoutEngine{

	@Override
	public void startMoving() {
		super.startMoving();
		System.out.println("Movement of cycle started");
	}

	
	// TransportationDevice c = new Bicycle(); 
	// c.startMoving();
}
