package chapter01.section03.delegation.lab;

abstract class Employee {
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return this.name;
	}
	public double getSalary() {
		return this.salary;
	}
	public abstract void manageSalary(double rate);
}
