package fr.dawan.javaintermediaire.telldontask.bad;

public class AccountService {

	private AccountRepository accountRepository;

	public AccountService(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}
	
	/*
	 * L'objet AccountService interroge les états de l'objet Account
	 * Au lieu de demander à l'objet Account le solde du compte (ex: getBalance) 
	 * Nous devrions lui transmettre une instruction ce qu'elle doit faire
	 * 
	 * L'objet AccountService informe simplement l'objet Account du montant. 
	 * Ensuite c'est l'objet Account qui a la responsabilité d'effectuer le retrait
	 * 
	 * Cela permet de mieux encapsuler les données et de maintenir une plus grande 
	 * modularité et lisibilité du code. 
	 */
	//Méthode de retrait 
	public void withdraw(int accountId, float amount) {
		Account c = accountRepository.findById(accountId);
		
		if(c.getBalance() < amount) {
			throw new IllegalArgumentException("Error : not enough money !");
		}
		
		c.setBalance(c.getBalance() - amount);
		
		accountRepository.save(c);
	}
	
}
