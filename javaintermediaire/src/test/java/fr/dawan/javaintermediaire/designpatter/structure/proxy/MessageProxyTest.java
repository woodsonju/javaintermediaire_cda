package fr.dawan.javaintermediaire.designpatter.structure.proxy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.designpattern.structure.proxy.Message;
import fr.dawan.javaintermediaire.designpattern.structure.proxy.MessageProxy;
import fr.dawan.javaintermediaire.designpattern.structure.proxy.UserMessage;

public class MessageProxyTest {
	
	@Test
	void testGetContent() {
		
		Message proxifiedMessage = new UserMessage("hello");
		
		//On passe par le proxy pour réaliser l'operation getContent 
		MessageProxy proxy = new MessageProxy(proxifiedMessage);
		String content = proxy.getContent();
		
		assertEquals("HELLO", content);
	}

}
