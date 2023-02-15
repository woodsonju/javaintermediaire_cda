package fr.dawan.javaintermediaire.demeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestDemeter {
	
	@Test
	void testCollectFunds() {
		List<Customer> custList = Arrays.asList(
								new Customer("cust1", new Wallet(5)),
								new Customer("cust2", new Wallet(3)),
								new Customer("cust3", new Wallet(0.5)));
		
		Paperboy paperboy = new Paperboy(custList);
		paperboy.collectedPayments();
		
		assertEquals(4, custList.get(0).getWallet().getMoney());
		assertEquals(2, custList.get(1).getWallet().getMoney());
		assertEquals(0.5, custList.get(2).getWallet().getMoney());
	}

}
