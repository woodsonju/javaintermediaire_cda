package fr.dawan.javaintermediaire.interfacesfonctionnelles;

@FunctionalInterface
public interface Creator<T> {

	T create(String s1, String s2);
	
}
