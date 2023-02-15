package fr.dawan.javaintermediaire.polymorphisme;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassMetierTest {

/*
 * @BeforeAll : exécutée une seule fois avant l'exécution du premier test de la classe
 * @BeforeEach : exécutée avant chaque méthode de tests
 */
	
	private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	

	@BeforeEach
	public void setUp() {
		//outputStream : 
		//(flux de sortie) est l'endroit où les valeurs seront desormais affichées
		System.setOut(new PrintStream(outputStream));
	}

	@Test
	void testBuy() {
		Chair  chaise = new Chair();
		ClassMetier.buy(chaise);
		assertEquals("deplier", outputStream.toString().trim());
	}

}
