package fr.dawan.javaintermediaire.designpattern.comportement.observer;

/**
 * 	Une interface Observer qui définit une méthode pour recevoir des notifications
 * @author Admin stagiaire
 *
 * @param <T>
 */
public interface Observer<T> {

	void update(T p);

}
