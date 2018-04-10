package chapter01.section03.delegation.lab;

public class StudentWorkerSalaryRole extends SalaryRole{

	public StudentWorkerSalaryRole(double salary) {
		super(salary);
	}
	
	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary -= 20;
	}
	
}
