package fr.dawan.javaintermediaire.genericite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ImportExportToolsTest {

	@Test
	void testTofromCSV() {
		List<Product> lp = Arrays.asList(new Product("Ordinateur", 1200, 2), 
				new Product("Imprimante", 700, 8),
				new Product("Clavier", 400, 8));
		
		String separator = ";";
		String filePath = "produits.csv";
		
		try {
			ImportExportTools.toCSV(filePath, lp, separator);
			List<Product> lp2 = ImportExportTools.fromCsv(filePath, Product.class);
			System.out.println(lp2);
			assertEquals(lp2.toString(), lp.toString());
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
				
	}

}
