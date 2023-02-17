package fr.dawan.javaintermediaire.solid.exo;

public interface IShoppingCart {
	
	public void addProduct(Product product);
	
	public void removeProduct(Product product);
	
	public double calculateTotal();
	
	public boolean checkout(Payment payment);

}
