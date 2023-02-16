package fr.dawan.javaintermediaire.designpattern.structure.adapter;

import java.rmi.UnmarshalException;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;


public class XmlConvertableImpl<T> implements XmlConvertable<T>{
	
	
	/*
	 * Nous allons apprendre à serialiser des objets Java en données XML 
	 * à l'aide d'une librairie qui se nomme Jackson (Jackson 2.0)  
	 * et à les déserialiser en Objet
	 * Ajouter la dependance : jackson-dataformat-xml  
	 * 							version : 2.9.8
	 */
	
	/* XmlMapper est une classe fournie par la bibliothèque Jackson 
	 * pour la serialisation d'un objet java en XML et la déserialisation du XML 
	 * en objet java
	 * Il fournit une interface simple pour lire et écrire du contenu XML en Java
	 */

	/**
	 * Serialiser un objet Java en XML
	 */
	@Override
	public String toXML(T obj) throws Exception {
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(obj);
		return xml;
		
	}

	/**
	 * Déserialiser un XML un objet java
	 */
	@Override
	public T fromXml(String xml, Class<T> clazz) throws Exception {
		XmlMapper xmlMapper = new XmlMapper();
		T obj  = xmlMapper.readValue(xml.getBytes(), clazz);
		return obj;
	}

}
