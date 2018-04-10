package chapter01.section03.delegation.lab;

class Employee {
	String name;
	SalaryRole salaryRole = null;
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;	
	}
	public double getSalary() {
		return salaryRole.getSalary();
	}
	public void manageSalary(double rate) {
		// SalaryRole 객체에게 위임함.
		salaryRole.manageSalary(rate);
		}
	public void setSalaryRole(SalaryRole salaryRole) {
		this.salaryRole =salaryRole;
	}
	
	public SalaryRole getSalaryRole() {
		return salaryRole;
	}
	
}
