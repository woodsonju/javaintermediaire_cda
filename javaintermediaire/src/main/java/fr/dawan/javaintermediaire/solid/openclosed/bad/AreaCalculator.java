package fr.dawan.javaintermediaire.solid.openclosed.bad;

//Open-Closed :
//classe ouverte pour l'extension
//fermée pour la modification (ce n'est pas le cas ici 
//car à chaque nouvelle forme
//on devra ajouter une nouvelle méthode pour le calcul de la surface)

//Une fois la responsabilité d'une classe ou fonction est clairement définie, 
//cette dernière est implémentée. 
//Après la revue de code et les différents tests passées, celles-ci ne doit plus bouger 
//pour éviter les régressions
//Toutes nouvelles fonctionnalités doivent être une extension de cette classe ou fonction
public class AreaCalculator {
	
	public double computeRectanbleArea(Rectangle rectangle) {
		return rectangle.getLength() * rectangle.getWidth();
	}
	
	public double computeCircleAre(Circle circle) {
		return Math.PI*Math.pow(circle.getRadius(), 2);
	}
	
	

}
