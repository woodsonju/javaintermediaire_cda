package fr.dawan.javaintermediaire.interfacesfonctionnelles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class NameParserTest {

	@Test
	void testParse() {
		NameParser<Name> np = new NameParser<>();
		Name res = np.parse("Jacques Célaire", 
				(firstName, lastName) -> new Name(firstName, lastName));
		System.out.println(res);
		assertEquals("Jacques", res.getFirstName());
		assertEquals("Célaire", res.getLastName());
		
	}
	

	@Test
	void testParseFactory() {
		NameParser<Name> np = new NameParser<>();
		Name res2 = np.parse("Jacques Célaire", Factory::createName);
		assertEquals("Jacques", res2.getFirstName());
		assertEquals("Célaire", res2.getLastName());
	}

}
