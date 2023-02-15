package fr.dawan.javaintermediaire.designpattern.comportement.observer;

/**
 * Une interface Subject qui définit une méthode pour enregistrer et supprimer des 
 observateurs, et pour notifier les observateurs lorsqu'un événement se produit
 * @author Admin stagiaire
 *
 */
public interface Subject<T> {
	
	void attach(Observer<T> obs);
	void detach(Observer<T> obs);
	
	//On passe un objet pour l'informer de la nature du changement
	void notify(T obj);


}
