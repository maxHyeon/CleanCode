package chapter02.section03.company;

public abstract class Employee {
	String name;
	double salary;
	Manager manager;
	
	public Employee(String name, double salary, Manager manager) {
		super();
		this.name = name;
		this.salary = salary;
		this.manager = manager;
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public Manager getManager() {
		return manager;
	}

	public double getSalary() {
		return salary;
	}

	abstract void manageSalary(double rate);
	
}
