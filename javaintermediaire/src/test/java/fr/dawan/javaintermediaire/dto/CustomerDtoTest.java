package fr.dawan.javaintermediaire.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;


public class CustomerDtoTest {

	@Test
	void testCustomerToCustomerDTO() {
		Customer c1 = new Customer();
		
		c1.setName(new Name("Rémy", "FASOL"));
		c1.setAccount(new Account("AX1Y", 330.0F));
		
		/*
		 * ModelMapper est une librairie Open-Source pour Java 
		 * qui facilite la convertion en les objets Java. 
		 * Elle peut être utilisée poyr convertir des objets DTO en objet 
		 * de modèle de données et vice-versa
		 */
		ModelMapper mapper = new ModelMapper();
		CustomerDto customerDto = mapper.map(c1, CustomerDto.class);
		assertEquals(customerDto.getCustomerFirstName(), c1.getName().getFirstName());
		assertEquals(customerDto.getAccountBalance(), c1.getAccount().getBalance());
	}
	
	@Test
	void testCustomerDtoToCustomer() {
		CustomerDto customerDto = new CustomerDto("José", "PALDIR", 500.0f);
		//DTO to Entity
		ModelMapper mapper = new ModelMapper();
		Customer customer = mapper.map(customerDto, Customer.class);
		assertEquals(customerDto.getCustomerLastName(), customer.getName().getLastName());
	
	}
	
	
	@Test
	void testCustomerToCustomerDTOPersonalise(){
		//Si besoin de specifier un Mapping personnalisé 
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.typeMap(Customer.class, CustomerDto.class).addMappings(mapper -> { 
					mapper.map(src -> src.getName().getFirstName(),CustomerDto::setCustomerFirstName);
					mapper.map(src -> src.getName().getLastName(),CustomerDto::setCustomerLastName);
					mapper.map(src -> src.getAccount().getBalance(),CustomerDto::setAccountBalance);
				});
						
	}
	
}
