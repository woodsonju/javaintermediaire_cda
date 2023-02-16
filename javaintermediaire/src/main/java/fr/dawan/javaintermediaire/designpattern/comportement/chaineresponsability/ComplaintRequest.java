package fr.dawan.javaintermediaire.designpattern.comportement.chaineresponsability;

//Gestion de la demande
public class ComplaintRequest {

	//n° etudiant 
	private int studentNumber; 
	
	/*
	 * 1: La demande a été traitée par prof (Teacher)
	 * 2: La demande a été traitée par le PedagDirector 
	 * 3: La demande a été traitée par le Director
	 */
	//1: Teacher,  2 : PedagDirector,  3: Director
	private int complaintType;
	
	private String message; 
	
	//Etat de la demande 
	public enum ComplaintState {
		OPENED, CLOSED
	}
	
	private ComplaintState state;
	
	public ComplaintRequest() {
		// TODO Auto-generated constructor stub
	}

	public ComplaintRequest(int studentNumber, int complaintType, String message, ComplaintState state) {
		super();
		this.studentNumber = studentNumber;
		this.complaintType = complaintType;
		this.message = message;
		this.state = state;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(int complaintType) {
		this.complaintType = complaintType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ComplaintState getState() {
		return state;
	}

	public void setState(ComplaintState state) {
		this.state = state;
	}
	
	
	
}
