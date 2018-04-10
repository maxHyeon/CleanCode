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

	// 추상 메소드로서 rate는 %비율이다.
	public void manageSalary(double rate) {
	}
}