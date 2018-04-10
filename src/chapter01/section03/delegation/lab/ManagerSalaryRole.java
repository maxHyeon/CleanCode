package chapter01.section03.delegation.lab;

public class ManagerSalaryRole extends SalaryRole {
	public ManagerSalaryRole(double salary) {
		super(salary);
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20만원을 추가로 받는다.
	}
}