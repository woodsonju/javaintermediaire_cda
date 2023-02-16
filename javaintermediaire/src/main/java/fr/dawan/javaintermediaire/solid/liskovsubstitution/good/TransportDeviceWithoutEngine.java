package fr.dawan.javaintermediaire.solid.liskovsubstitution.good;

public abstract class TransportDeviceWithoutEngine extends TransportationDevice{

	@Override
	public void startMoving() {
		System.out.println("Basic functionality of moving for device without engine");
	}

	
}
