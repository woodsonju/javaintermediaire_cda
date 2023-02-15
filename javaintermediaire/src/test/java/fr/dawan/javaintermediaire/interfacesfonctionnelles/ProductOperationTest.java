package fr.dawan.javaintermediaire.interfacesfonctionnelles;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.genericite.Product;

class ProductOperationTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testGetDESC() {
		List<Product> lp = findAll();
		List<String> listDesc = ProductOperation.getByString(lp, (p) -> p.getDescription());
		assertEquals(listDesc.get(0), lp.get(0).getDescription());
	}
	
	@Test
	void testGetPrice() {
		List<Product> lp = findAll();
		List<Double> listDesc = ProductOperation.getByDouble(lp, Product::getPrice);
		assertEquals(listDesc.get(0), lp.get(0).getPrice());

	}

	private List<Product> findAll() {
		List<Product> lp = Arrays.asList(new Product("Ordinateur", 1200, 2), 
				new Product("Imprimante", 700, 8),
				new Product("Clavier", 400, 8));
		return lp;
	}

}
