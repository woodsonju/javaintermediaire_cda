package fr.dawan.javaintermediaire.genericite;

import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class ProductDAO implements IDao<Product> {
	
//	private List<Product> lp = new ArrayList();
	private List<Product> lp;
	
	public ProductDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ProductDAO(List<Product> lp) {
		super();
		this.lp = lp;
	}


	@Override
	public List<Product> findAll() {
		return lp;
	}


	@Override
	public void insert(Product obj) {
		
	}
	
	//Predicate<Product> predicate =  (p) -> p.getPrice() > 100
	public void add(Product p, Predicate<Product> predicate) {
		boolean b = predicate.test(p);
		if(b) {
			lp.add(p);
		}
		
	}
	
	
	


}
