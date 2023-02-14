package fr.dawan.javaintermediaire.manipdate;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * Avant Java 8 pour gérer l'heure et les dates, nous avions  
		 * la classe Date, Calendar mais il y avait plusieurs problèmes de perfermances 
		 * ainsi que certaines méthodes qui sont obsolètes
		 * Donc Java 8 a introduit de nouveaux concepts Date dans le package java.time
		 */
		
		//Avant java 8 
		System.out.println("_____________Avant Java 8__________________________");
		Date d1 = new Date();
		System.out.println(d1);  //Affiche la date d'aujourd'hui
		
		//date --> String = format
		//on definit pattern 
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String str = sdf.format(d1);
		System.out.println("date formatée : " + str);
		
		//String --> date = parse 
//		System.out.println("\n Saisir une date (dd-MM-yyyy) : ");
//		Scanner input = new Scanner(System.in);
//		String saisie = input.nextLine();
//		try {
//			Date d2 = sdf.parse(saisie);
//			System.out.print("Vous avez saisir : " + sdf.format(d2));
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Veuillez saisir une date au format indiqué!!");
//		}
		
		
		//Calendar 
		//Permet de faire des operations sur les dates
		Calendar myCalendar = Calendar.getInstance();
		myCalendar.set(2023, 02, 13);
		Date d3 = myCalendar.getTime();
		System.out.println("\nAvec Calendar\t" + sdf.format(d3));
				


		System.out.println("\n***********************Avec java 8*****************************");
		LocalDate ld1 =  LocalDate.of(2023, 02, 13);
		System.out.println("ld1 = " + ld1);
		
		//Formatter une date 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(ld1));
		
		System.out.println("Date/Heure : " + LocalDateTime.now());
		
		System.out.println("TAHITI : " + LocalDateTime.now(
				Clock.system(ZoneId.of("Pacific/Tahiti"))
				));
		
		//durée 5j 
		Duration duration1 = Duration.ofDays(5);
		System.out.println(duration1);
		
		Duration duration2 = Duration.of(5, ChronoUnit.DAYS);
		System.out.println(duration2);
		
		
		//L'epoch represente la date initial à partir de laquelle est mesuré 
		//le temps dans un programme (01/01/1970)
		Instant inst1 = Instant.ofEpochSecond(1333333);
		System.out.println(inst1);
		
	}

}
