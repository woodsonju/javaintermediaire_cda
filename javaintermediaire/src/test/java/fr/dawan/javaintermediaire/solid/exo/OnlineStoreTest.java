package fr.dawan.javaintermediaire.solid.exo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class OnlineStoreTest {

	@Test
	void testShoppingCart() {
		
		IShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addProduct(new Product(1L, 160, "Ecran"));
		shoppingCart.addProduct(new Product(2L, 600, "Iphone13"));
		shoppingCart.addProduct(new Product(3L, 200, "Imprimante"));
		
		double total = shoppingCart.calculateTotal();
		assertEquals(960.0, total);
		
		shoppingCart.checkout(new CreditCartPayment("XYZ11", "782", "12-04-2027"));
		
	}

}
