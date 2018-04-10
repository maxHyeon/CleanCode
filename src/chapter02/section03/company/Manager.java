package chapter02.section03.company;

public class Manager extends Employee {

	public Manager(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20;
	}	
	

}
