package fr.dawan.javaintermediaire.solid.srp.bad.dao;

import fr.dawan.javaintermediaire.solid.srp.bad.entities.Employee;

public interface IEmployeeDAO {
	
	Employee findEmployeeById(int id);
	void addEmployee(Employee employee);
	void sendEmail(Employee employee, String content);
	
	
}
