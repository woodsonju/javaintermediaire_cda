package fr.dawan.javaintermediaire.solid.exo;

public class Product {
	
	private Long id;
	private double price; 
	private String name;
	
	public Product() {
	}
	
	
	public Product(Long id, double price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double accessPrice() {
		//traitements 
		//.........
		//.........
		return price;
	}
	
	

}
