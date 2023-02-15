package fr.dawan.javaintermediaire.interfacesfonctionnelles;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import fr.dawan.javaintermediaire.genericite.Product;

public class ProductOperation {
	

	public static List<String> getByString(List<Product> listP, Function<Product, String> func) {
		List<String> listOut = new ArrayList<>();
		for (Product p : listP) {
			listOut.add(func.apply(p));
		}
		
		return listOut;
	}
	
	public static List<Double> getByDouble(List<Product> listP, Function<Product, Double> func) {
		List<Double> listOut = new ArrayList<>();
		for (Product p : listP) {
			listOut.add(func.apply(p));
		}
		return listOut;
	}

}
