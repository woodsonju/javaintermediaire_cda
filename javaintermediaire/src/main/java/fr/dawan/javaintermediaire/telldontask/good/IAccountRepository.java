package fr.dawan.javaintermediaire.telldontask.good;

public interface IAccountRepository {

	Account findById(int accountId);
	void save(Account c);
	
}
