package fr.dawan.javaintermediaire.genericite;

public class Product {
	
	private String description; 
	private Double price;
	private Integer quantite;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String description, double price, int quantite) {
		super();
		this.description = description;
		this.price = price;
		this.quantite = quantite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", price=" + price + ", quantite=" + quantite + "]";
	}
	
	

}
