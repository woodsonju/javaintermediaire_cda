package fr.dawan.javaintermediaire.genericite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ImportExportTools {

//	public static <T> void toCSV(String filePath, List<T> objList, String separator) throws Exception {
//
//		if (objList != null && objList.size() > 0) {
//			/*
//			 * Une ressource est un objet qui doit être fermé une fois que le programme est
//			 * terminé L'instruction try-with-ressources garantit que chaque ressource est
//			 * fermée
//			 */
//			try (BufferedWriter fw = new BufferedWriter(new FileWriter(filePath, StandardCharsets.ISO_8859_1))) {
//
//				// Obtenir tous les attributs de la classe
//				// objList.getClass().getFields() : recupère la liste des attributs de la classe
//				// getName() : retourne l'attribut
//				
//				fw.write("Description" + separator + "Price" + separator + "Quantité");
//				fw.newLine();
//
//				for (T t : objList) {
//					// Récuperation de l'objet Class
//					// Il represente note class, on va pouvoir connaitre les caracteristique de
//					// notre classe de façon dynamique
//					Class<?> clazz = t.getClass();
//
//					// Obtenir tous les attributs de la class
//					Field[] fields = clazz.getDeclaredFields();
//					StringBuilder sb = new StringBuilder();
//					// List<Product> products = Arrays.asList(new Product("Ordinateur', 1200, 2);
//					for (Field f : fields) {
//						f.setAccessible(true);
//						// get : Recupère la valeur du champs
//						sb.append(f.get(t).toString()).append(separator);
//					}
//
//					sb.append("\n");
//					fw.write(sb.toString());
//				}
//			}
//		}
//
//	}
	
	public static <T> void toCSV(String filePath, List<T> objList, String separator) throws Exception {

		if (objList != null && objList.size() > 0) {
			/*
			 * Une ressource est un objet qui doit être fermé une fois que le programme est
			 * terminé L'instruction try-with-ressources garantit que chaque ressource est
			 * fermée
			 */
			try (BufferedWriter fw = new BufferedWriter(new FileWriter(filePath, StandardCharsets.ISO_8859_1))) {

				// Obtenir tous les attributs de la classe
				// objList.getClass().getFields() : recupère la liste des attributs de la classe
				// getName() : retourne l'attribut
				
				Field[] fields = objList.get(0).getClass().getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true);
					fw.write(field.getName() + separator);
				}
				fw.newLine();

				for (T t : objList) {
					
					StringBuilder sb = new StringBuilder();
					// List<Product> products = Arrays.asList(new Product("Ordinateur', 1200, 2);
					for (Field f : fields) {
						f.setAccessible(true);
						// get : Recupère la valeur du champs
						sb.append(f.get(t).toString()).append(separator);
					}

					sb.append("\n");
					fw.write(sb.toString());
				}
			}
		}

	}

	public static <T> List<T> fromCsv(String filePath, Class<T> clazz) throws Exception {
		List<T> lp = new ArrayList<>();

		File file = new File(filePath);
		if (file.isFile()) {
			try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
				String headerline = reader.readLine(); // Description; Price; Quantité
				String line = null;

				while ((line = reader.readLine()) != null) {
					String[] tab = line.split(";"); //Ordinateur;1200;2  ==> [Ordinateur, 1200, 2]
					// Création d'une instance génerique
					// newInstance: permettent de récuperer une instance
					T obj = clazz.getDeclaredConstructor().newInstance();

					// Retourne un tableau de tous les attributs définis dans la classe
					Field[] fieldsArray = clazz.getDeclaredFields();

					int i = 0;

					for (Field f : fieldsArray) {
						//f: private String Description
						f.setAccessible(true);
						//Retourne un objet de type classe qui répresente le type de l'attribut
						Class<?> type = f.getType();
						if(type.equals(String.class)) {
							f.set(obj, tab[i]);
						} else if(type.equals(Double.class)) {
							f.set(obj, Double.parseDouble(tab[i]));
						} else if(type.equals(Integer.class)) {
							f.set(obj, Integer.parseInt(tab[i]));
						}
						
						i++;
						
					}
					
					lp.add(obj);
				}
			}
		}

		return lp;
	}

}
