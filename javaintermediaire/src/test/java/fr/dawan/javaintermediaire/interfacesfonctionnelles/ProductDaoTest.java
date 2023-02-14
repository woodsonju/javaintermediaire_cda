package fr.dawan.javaintermediaire.interfacesfonctionnelles;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.genericite.Product;
import fr.dawan.javaintermediaire.genericite.ProductDAO;

class ProductDaoTest {


	@Test
	void testAdd() {
		//On injecte une implementation, un objet new ArrayList
		ProductDAO dao = new ProductDAO(new ArrayList<>());
		//Ajouter le produit si le prix est superieur à 100
		dao.add(new Product("Ordinateur", 1200, 2), (p) -> p.getPrice() > 100);
	}

}
