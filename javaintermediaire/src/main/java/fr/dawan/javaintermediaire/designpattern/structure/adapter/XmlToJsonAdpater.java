package fr.dawan.javaintermediaire.designpattern.structure.adapter;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * Nous créons une classe Adapter (XmlToJsonAdpater) qui implemente Target 
 * et qui utilise une instance de Adaptee(XmlConvertable) pour executer les 
 * méthode toXML et fromXML
 * De cette façon nous pouvons utiliser Adaptee (XmlConvertable) avec d'autres  classes 
 * qui attendent une interface Target
 */
public class XmlToJsonAdpater<T> implements Target<T> {
	
	private XmlConvertable<T> xmlConverter;
	
	public XmlToJsonAdpater() {
		// TODO Auto-generated constructor stub
	}
	
	
	public XmlToJsonAdpater(XmlConvertable<T> xmlConverter) {
		super();
		//Nous avons besoin d'une reference à l'objet que nous adaptons (XmlConvertable)
		this.xmlConverter = xmlConverter;
	}
	

	@Override
	public String toJson(T obj) throws Exception {
		ObjectMapper jsonMapper = new ObjectMapper();
		String xml = xmlConverter.toXML(obj);
		String json = jsonMapper.writeValueAsString(obj);
		//TODO tranformation du XML en JSON
		return json;
	}

}
