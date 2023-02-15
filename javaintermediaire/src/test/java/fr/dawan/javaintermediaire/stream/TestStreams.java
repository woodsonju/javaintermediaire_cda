package fr.dawan.javaintermediaire.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.genericite.Product;

class TestStreams {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testStreamSummingDouble() {
		
		List<Product> listProd = findAll();
		
		double  sumPrices = listProd.stream()
				.collect(Collectors.summingDouble(Product::getPrice));
		
		
		double sum = 0.0;
		for (Product product : listProd) {
			sum += product.getPrice();
		}
		
		assertTrue(sum == sumPrices);
		
	}
	
	
	//Recuperer tous les prix des produits entre 100 et 350
	@Test
	void testStreamFilter() {
		
		List<Product> listProd = findAll();
		
		List<Product> lpFilter = listProd.stream()
							.filter((p) -> p.getPrice() > 100 && p.getPrice() <= 350)
							.collect(Collectors.toList());
		
		
		Predicate<Product> pred1 = (p) -> (p.getPrice() > 100 && p.getPrice() <= 350);
		int count = 0;
		for (Product product : listProd) {
			if(pred1.test(product)) {
				count++;
			}
		}
		
		assertTrue(count == lpFilter.size());
	}
	
	
	//Afficher une collection avec une augmentation de prix de chaque produit de 5%
	//map 
	@Test
	void testStreamMap() {
		List<Product> listProd = findAll();
		List<Product> lp3 = listProd.stream()
				.map(p  -> {return new Product(p.getDescription(), p.getPrice()*1.05, 
							p.getQuantite());})
							.collect(Collectors.toList());
		
		for (int i = 0; i < listProd.size(); i++) {
			assertTrue(listProd.get(i).getPrice()*1.05 == lp3.get(i).getPrice());
		}
							
	}
	

	
	private List<Product> findAll() {
		List<Product> lp = Arrays.asList(new Product("Ordinateur", 1200, 2), 
				new Product("Imprimante", 112, 8),
				new Product("Clavier", 250, 8));
		return lp;
	}

}
