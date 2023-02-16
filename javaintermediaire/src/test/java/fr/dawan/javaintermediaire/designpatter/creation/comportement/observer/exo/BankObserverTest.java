package fr.dawan.javaintermediaire.designpatter.creation.comportement.observer.exo;

import org.junit.jupiter.api.Test;

import fr.dawan.javaintermediaire.designpattern.comportement.observer.exo.Bank;
import fr.dawan.javaintermediaire.designpattern.comportement.observer.exo.Client;

class BankObserverTest {


	@Test
	void testBankObserver() {
		Bank bank = new Bank("Banque ABC", 1000.0);
		Client client1 = new Client("Client1");
		Client client2 = new Client("Client2");
		
		bank.attach(client1);
		bank.attach(client2);
		
		bank.deposit(1000.0);
		bank.withdraw(50.0);
		
		bank.detach(client2);
		
		System.out.println("--------------------------------------");
		
		bank.withdraw(100.0);
	}

}
