package fr.dawan.javaintermediaire.interfacesfonctionnelles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.genericite.Product;

class OperationImplTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	//Avant java 8
	@Test
	void testSomething1() {
		//Sans utilisation d'expression lambda 
		OperationImpl.doSomething(new Operation<Product>() {

			@Override
			public Product funtion() {
				return new Product("Clavier", 400, 8);
			}

			@Override
			public void onSuccess(Product prod) {
				System.out.println(prod.getPrice());
				
			}

			@Override
			public void onError(Exception e) {
				System.out.println("Erreur : " + e.getMessage());
				
			}
		});
	}
	
	
	//Avec l'utiisation d'expressions lambda
	@Test
	void testSomething2() {
		OperationImpl.doSomething(() -> {return new Product("Imprimante", 700, 8);}, 
				(p) -> System.out.println(p.getPrice()), 
				(e) -> System.out.println("Erreur : " + e.getMessage()));
				
	}
	
	
	

}
