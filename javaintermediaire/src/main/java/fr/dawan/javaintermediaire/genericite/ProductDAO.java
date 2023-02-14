package fr.dawan.javaintermediaire.genericite;

import java.util.ArrayList;
import java.util.List;

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


}
