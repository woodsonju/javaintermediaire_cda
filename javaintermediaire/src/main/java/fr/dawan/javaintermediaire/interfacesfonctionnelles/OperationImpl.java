package fr.dawan.javaintermediaire.interfacesfonctionnelles;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class OperationImpl {

	//Avant Java 8 
	public static <T>  void doSomething(Operation<T> op)  {
		
		try {
			T res = op.funtion();
			op.onSuccess(res);
		} catch (Exception e) {
			op.onError(e);
		}
	
	}
	
	//A partir de java 8
	public static <T>  void doSomething(Supplier<T> supp, Consumer<T> cons, Consumer<Exception> cExcep) {
		try {
			T res = supp.get();
			cons.accept(res);
		} catch (Exception e) {
			cExcep.accept(e);
		}
	}
	
}
