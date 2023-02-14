package fr.dawan.javaintermediaire.reflexion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Application {

	public static void main(String[] args) {
		
		//On peut recuperer l'instance de la classe de différente façon 
		
		
		//1.1 - avec .class
		Class<String> c1 = String.class;
		System.out.println(c1);
		
		//1.2 avec la méthode getClass
		String str = "Hello";
		Class<? extends String> c2 = str.getClass();
		System.out.println(c2);
		
		//1.3 Avec la Class.forName
		//La méthode statique forName() de la classe Class permet de charger dynamiquement 
		//une classe dont le nom est fourni en paramètre
		try {
			Class<?> c3 = 	Class.forName("java.lang.String");
			System.out.println(c3);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Nom de la classe Complete (java.lang.String)
		System.out.println(c1.getName());
		
		//Nom simple de cette classe 
		System.out.println(c1.getSimpleName());
		
		//Nom de la classe mère 
		System.out.println(c1.getSuperclass().getName());
		
		//Obtenir tous les attributs de la classe 
		System.out.println("\n_____Attributs_______");
		
		Field[] attr = c1.getDeclaredFields();
		for (Field field : attr) {
			//field.getName() : retourne le nom de l'attribut
			System.out.println(field.getName());
		}
		
		//Obtenir toutes les méthodes de la classe 
		System.out.println("\n_____Méthodes_______");
		Method[] methodes = c1.getDeclaredMethods();
		for (Method method : methodes) {
			//Nom de la méthode 
			System.out.println(method.getName() + "\t");
			
			//Nom du type de retour de la méthode 
			System.out.println(": " + method.getReturnType().getName() + "\n");
			
			//Nom de l'accessibilité de la méthode : public, private, protected
			int modifier = method.getModifiers();
			if(Modifier.isPublic(modifier)) {
				System.out.println("public");
			} else if(Modifier.isPrivate(modifier)){
				System.out.println("private");
			}else if(Modifier.isProtected(modifier)){
				System.out.println("protected");
			}
			
			//Obtenir les paramètre de la méthode 
			Parameter[] params = method.getParameters();
			for (Parameter param : params) {
				System.out.println("\t" + param.getName() + " " + param.getType().getName());
			}
			
			System.out.println("\n-------------------------------------------------------------\n");

		}
		
		System.out.println("\n-----------------------Instanciation dynamique avec newInstance--------------------------");
		String strDefault;
		try {
			//1.1 constructeur sans paramètre
			strDefault = c1.getConstructor().newInstance();
			//1.2 Avec le constructeur qui a une chaine de caractère pour paramètre 
			Constructor<String> constructeur = c1.getConstructor(new Class[] {String.class});
			String strString = constructeur.newInstance(new Object[] {"azerty"});
			System.out.println(strString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//Invocation dynamique d'une méthode 
		System.out.println("\n\n---------Invocation dynamique d'une méthode------------------");
		
		//Instanciation Statique 
		String str22 = new String("Azerty123");
		str22= str22.toUpperCase();
		str22 = str22.substring(6);
		String.valueOf(false);
		
		//Appeler une methode dynamiquement : 
				//getMethod 
				//invoke
		//Instanciation dynamique
		try {
			String strMeth = c1.getConstructor(new Class[] {String.class})
					.newInstance(new Object[] {"Azerty123"});
			//La méthode getMethod() permet d'obtenir les méthode publiques 
			//de la classe à laquelle appartient un objet
			Method mSp = c1.getMethod("toUpperCase", new Class[] {});
			//invoke(): Elle invoque une méthode de la classe lors de l'execution 
			System.out.println(mSp.invoke(strMeth, new Object[] {}));
			
			//Méthode avec paramètre 
			Method mAp = c1.getMethod("substring", new Class[] {int.class});
			System.out.println(mAp.invoke(strMeth, new Object[] {6}));
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}
	
}
