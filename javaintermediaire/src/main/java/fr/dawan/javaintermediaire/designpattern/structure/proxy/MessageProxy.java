package fr.dawan.javaintermediaire.designpattern.structure.proxy;

/*
 * Nous avons une classe Proxy (MessageProxy) 
 * qui implemente également l'interface Message 
 * et qui agit comme un proxy pour la classe UserMessage
 */
public class MessageProxy implements Message{
	
	private Message proxiedMessage;
	
	public MessageProxy() {
		// TODO Auto-generated constructor stub
	}
	
	
	public MessageProxy(Message proxiedMessage) {
		super();
		this.proxiedMessage = proxiedMessage;
	}



	@Override
	public String getContent() {
		
		//Appel de la méthode getContent() de UserMessage
		String notTransformedContent =  proxiedMessage.getContent();
		//Vérification ou tranformation
		String transformedContent = notTransformedContent.toUpperCase();
		return transformedContent;
	}

}
