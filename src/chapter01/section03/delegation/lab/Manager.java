package chapter01.section03.delegation.lab;

public class Manager {
	String name;
	double salary;

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20������ �߰��� �޴´�.
	}
}