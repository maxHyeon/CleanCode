package chapter01.section03.delegation.lab;

public class MereClerk extends Employee {
	MereClerk(String name, double salary) {
		super(name,salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}
}