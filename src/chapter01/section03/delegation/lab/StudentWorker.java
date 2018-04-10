package chapter01.section03.delegation.lab;

public class StudentWorker extends Employee{

	public StudentWorker(String name,double salary) {
		super(name,salary);
	}
	
	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary -= 20;
	}
	
}
