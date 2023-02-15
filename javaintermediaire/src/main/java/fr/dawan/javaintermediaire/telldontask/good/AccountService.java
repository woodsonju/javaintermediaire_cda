package fr.dawan.javaintermediaire.telldontask.good;

public class AccountService implements IAccountService{

	private AccountRepository accountRepository;

	public AccountService(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}

	@Override
	public void withdraw(int accountId, float amount) {
		Account c = accountRepository.findById(accountId);
		
		//Nous transmettons une instruction sur ce que l'objet Account doit faire
		c.withdrawal(amount);
		
		accountRepository.save(c);
	}


	
}
