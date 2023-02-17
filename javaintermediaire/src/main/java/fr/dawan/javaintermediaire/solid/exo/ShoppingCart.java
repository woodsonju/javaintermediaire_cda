package fr.dawan.javaintermediaire.solid.exo;

import java.util.ArrayList;
import java.util.List;

//Gestion du panier d'achat
public class ShoppingCart implements IShoppingCart {
	
	private List<Product> products;
	
	public ShoppingCart() {
		products = new ArrayList<>();
	}

	@Override
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public void removeProduct(Product product) {
		products.remove(product);
	}

	@Override
	public double calculateTotal() {
	
		double total = 0.0;
		
		for (Product product : products) {
			total += product.accessPrice();
		}
		
		return total;
	}

	@Override
	public boolean checkout(Payment payment) {
		double amount = calculateTotal();
		return payment.pay(amount);
	}
	

}
