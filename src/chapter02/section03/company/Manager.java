package chapter02.section03.company;

public class Manager extends Employee {

	public Manager(String name, int salary) {
		super(name,salary);
	}

	void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20;
	}	
	

}
