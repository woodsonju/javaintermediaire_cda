package fr.dawan.javaintermediaire.telldontask.bad;

public class AccountRepository {

	public Account findById(int accountId) {
		System.out.println("methode findById");
		return null;
	}
	
	public void save (Account c) {
		System.out.println("methode save");
	}
}
