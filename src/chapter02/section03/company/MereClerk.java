package chapter02.section03.company;

public class MereClerk extends Employee {

	public MereClerk(String name, int salary, Manager manager) {
		super(name,salary,manager);
	}

	void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}
	
}
