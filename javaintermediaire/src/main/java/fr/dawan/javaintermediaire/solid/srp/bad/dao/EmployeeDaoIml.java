package fr.dawan.javaintermediaire.solid.srp.bad.dao;

import java.util.List;

import fr.dawan.javaintermediaire.solid.srp.bad.entities.Employee;

public class EmployeeDaoIml implements IEmployeeDAO{
	
	List<Employee> employees;
	
	public EmployeeDaoIml() {
		// TODO Auto-generated constructor stub
	}
	
	

	public EmployeeDaoIml(List<Employee> employees) {
		super();
		this.employees = employees;
	}



	@Override
	public Employee findEmployeeById(int id) {
		return employees.get(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	/*
	 * La méthode sendEmail n'est pas de la responsabilité de EmployeeDAO, 
	 * la logique envoie des mails il faut l'ajouter dans une autre interface 
	 * et une classe implementant cette interface
	 * Il faut créer une autre interface qui sera responsable des fonctionnalités
	 * liées à la messagerie
	 */
	@Override
	public void sendEmail(Employee employee, String content) {
		System.out.println(content + " " + employee);
		
	}
	
	

}
