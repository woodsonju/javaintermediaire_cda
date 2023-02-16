package fr.dawan.javaintermediaire.solid.srp.good.service;

import fr.dawan.javaintermediaire.solid.srp.bad.entities.Employee;

public interface IEmailSenderService {
	
	void sendEmail(Employee employee, IEmailContent content);
	
}
