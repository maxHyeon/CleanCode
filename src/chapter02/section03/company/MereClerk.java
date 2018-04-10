package chapter02.section03.company;

public class MereClerk extends Employee {

	public MereClerk(String name, int salary, Manager manager) {
		this.name = name;
		this.salary = salary;
		this.manager = manager;
	}

	void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}
	
}
