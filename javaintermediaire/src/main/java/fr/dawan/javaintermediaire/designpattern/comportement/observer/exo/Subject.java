package fr.dawan.javaintermediaire.designpattern.comportement.observer.exo;

public interface Subject {

	public void attach(Observer observer);
	public void detach(Observer observer);
	public void notifyObservers();
	
}
