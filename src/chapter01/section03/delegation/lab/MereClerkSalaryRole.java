package chapter01.section03.delegation.lab;

public class MereClerkSalaryRole extends SalaryRole {
	MereClerkSalaryRole(double salary) {
		super(salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}
}