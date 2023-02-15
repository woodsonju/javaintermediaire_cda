package fr.dawan.javaintermediaire.designpatter.creation.comportement.observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.designpattern.comportement.observer.Customer;
import fr.dawan.javaintermediaire.designpattern.comportement.observer.Observer;
import fr.dawan.javaintermediaire.designpattern.comportement.observer.Product;

public class ObservertTest {
	
	@Test
	void testObserver() {
		Product p = new Product("Ordinateur", 350.0);
		
		Observer<Double> obs1 = new Customer("cust1");
		p.attach(obs1);
		
		Observer<Double> obs2 = new Customer("cust2");
		p.attach(obs2);
		
		//Modification du prix
		double newPrice = 300.0;
		
		//Ce changement de prix déclenche de 2 notification 
		p.changePrice(newPrice);
		
		assertEquals(((Customer) obs1).getLastObservedPrice(), newPrice);
		assertEquals(((Customer) obs2).getLastObservedPrice(), newPrice);

	}

}
