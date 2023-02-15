package fr.dawan.javaintermediaire.encapsulation;

public class Rectangle {
	
	private Long length;
	private Long width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(Long length, Long width) throws IllegalArgumentException{
		super();
		//this.length = length;
		//this.width = width;
		setLength(length);
		setWidth(width);
	}

	public Long getLength() {
		return length;
	}

	public void setLength(Long length) throws IllegalArgumentException{
		if(length<= 0) {
			throw new IllegalArgumentException("Length can't be negative !");
		}
		this.length = length;
	}

	public Long getWidth() {
		return width;
	}

	public void setWidth(Long width) throws IllegalArgumentException{
		if(width <= 0) {
			throw new IllegalArgumentException("Width can't be negative !");
		}
		this.width = width;
	}
	
	public Long getArea() {
		return this.length*this.width;
	}
	
	public void redim(Long length, Long width) throws IllegalArgumentException {
		setLength(length);
		setWidth(width);
	}

}
