package chapter01.section03.delegation.lab;

public class Manager extends Employee {
	public Manager(String name, double salary) {
		super(name,salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20만원을 추가로 받는다.
	}
}