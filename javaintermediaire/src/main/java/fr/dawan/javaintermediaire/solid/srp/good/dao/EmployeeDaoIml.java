package fr.dawan.javaintermediaire.solid.srp.good.dao;

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

	
	

}
