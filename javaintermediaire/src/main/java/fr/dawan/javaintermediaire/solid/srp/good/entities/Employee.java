package fr.dawan.javaintermediaire.solid.srp.good.entities;


//SOLID : Single Responsibility Principle 
//Le code au sein d'une classe ne doit avoir qu'une seule responsabilité, 
//qu'un seul type de tâche à effectuer. 
//Si vous prenez conscience que 2 tâches différentes sont effectuées, 
//posez-vous la question 
//de savoir si vous devez scinder votre classe en deux ou non.
//(principe applicable aux méthodes, classes, packages, modules)

//Intérêts : 
//- Organisation du code
//- Réduire la fragilité (tolérance aux changements)
//- Faible couplage
//- Faciliter les modifications
public class Employee {
	
	private int employeeId;
	private String name;
	private String address;
	
	public Employee() {
	}

	public Employee(int employeeId, String name, String address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
