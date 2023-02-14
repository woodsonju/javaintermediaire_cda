package fr.dawan.javaintermediaire.genericite;

import java.util.List;

public interface IDao<T> {

	List<T> findAll();
	void insert(T obj);
	
}
