package fr.dawan.javaintermediaire.designpatter.structure.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.designpattern.structure.adapter.Target;
import fr.dawan.javaintermediaire.designpattern.structure.adapter.XmlConvertable;
import fr.dawan.javaintermediaire.designpattern.structure.adapter.XmlConvertableImpl;
import fr.dawan.javaintermediaire.designpattern.structure.adapter.XmlToJsonAdpater;
import fr.dawan.javaintermediaire.genericite.Product;


class XmlToJsonAdapterTest {

	@Test
	void testXMLToJson() {
		Product p = new Product("Ordinateur", 1200, 2);
		XmlConvertable<Product> pXml = new XmlConvertableImpl<>();
//		
//		try {
//			String xml = pXml.toXML(p);
//			System.out.println(xml);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Target<Product> xmlToJsonAdapter = new XmlToJsonAdpater<>(pXml);
		try {
			String pJson = xmlToJsonAdapter.toJson(p);
			System.out.println(pJson);
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
