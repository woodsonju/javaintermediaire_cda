package fr.dawan.javaintermediaire.designpattern.structure.adapter;

//Target est l'interface cible que nous voulons utiliser 
public interface Target<T> {

	String toJson(T obj) throws Exception;
	
}
