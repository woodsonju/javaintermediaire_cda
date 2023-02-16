package fr.dawan.javaintermediaire.designpattern.structure.proxy;

public class UserMessage implements Message {
	
	private String content;
	
	public UserMessage() {
		// TODO Auto-generated constructor stub
	}

	public UserMessage(String content) {
		super();
		this.content = content;
	}


	@Override
	public String getContent() {
		return content;
	}

}
