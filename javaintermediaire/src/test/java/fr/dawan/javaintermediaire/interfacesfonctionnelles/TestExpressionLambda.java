package fr.dawan.javaintermediaire.interfacesfonctionnelles;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.genericite.Product;

/*
 * Expression Lambda : fonction anonyme qui permet de simplifier l'écriture 
 *                     d'un code 
 * Elle sert d'implementation pour une méthode abstraite de l'interface 
 * 
 * syntaxe : (arguments)  -> {instructions}
 * 			(a, b) -> {return a+b;}
 */
class TestExpressionLambda {

	@Test
	void testLambda() {
		List<Product> lp = Arrays.asList(new Product("Ordinateur", 1200, 2), 
				new Product("Imprimante", 700, 8),
				new Product("Clavier", 400, 8));
		
		lp.forEach(p -> System.out.println(p));
		
		
		
		//Trie par prix decroissant
		//Classe anonyme
		Collections.sort(lp, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return  Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		
		
		/*
		 * Une lambda est la redefinition d'une méthode d'une interface 
		 * fonctionnelle sans avoir à faire une classe anonyme, donc gain de ligne 
		 * de code et de visibilité
		 */
		Collections.sort(lp, (o1, o2) -> {
			return Double.compare(o1.getPrice(), o2.getPrice());
		});
		
	}

}
