package chapter01.section03.delegation.lab;

abstract class SalaryRole {
	double salary;

	SalaryRole(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// �߻� �޼ҵ�μ� rate�� %�����̴�.
	public void manageSalary(double rate) {
	}
}