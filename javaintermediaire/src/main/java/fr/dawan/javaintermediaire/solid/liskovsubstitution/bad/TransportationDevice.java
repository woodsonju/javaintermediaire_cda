package fr.dawan.javaintermediaire.solid.liskovsubstitution.bad;

public abstract class TransportationDevice {
	
	protected String name; 
	protected double speed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public abstract void startEngine(); 
	
	public abstract void startMovement();
	
	
}
