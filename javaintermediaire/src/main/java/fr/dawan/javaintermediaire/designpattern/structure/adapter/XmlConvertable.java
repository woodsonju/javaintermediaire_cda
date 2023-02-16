package fr.dawan.javaintermediaire.designpattern.structure.adapter;


/*
 * L'adaptee (XmlConvertable) est interface existante qui deux méthodes 
 * toXML et fromXml incomptatible avec l'interface Target
 */
public interface XmlConvertable<T> {
	
	String toXML(T t) throws Exception;
	T fromXml(String xml, Class<T> clazz) throws Exception;
}
