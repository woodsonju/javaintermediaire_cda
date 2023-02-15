package fr.dawan.javaintermediaire.telldontask.good;

public class AccountRepository implements IAccountRepository{

	@Override
	public Account findById(int accountId) {
		System.out.println("methode findById");
		return null;
	}

	@Override
	public void save(Account c) {
		System.out.println("methode save");
		
	}
	
	
	
}
