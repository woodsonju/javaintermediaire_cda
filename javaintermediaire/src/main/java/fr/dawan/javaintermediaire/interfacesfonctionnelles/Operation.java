package fr.dawan.javaintermediaire.interfacesfonctionnelles;

public interface Operation<T> {

	//Retourne un élément de type T sans paramètre 
	//Supplier 
	T funtion();
	
	//Prend un paramètre T et ne retourne rien 
	//Consumer 
	void onSuccess(T res);
	
	//Prend un paramètre T et ne retourne rien 
	//Consumer
	void onError(Exception e);
	
}
