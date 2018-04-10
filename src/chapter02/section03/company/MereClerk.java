package chapter02.section03.company;

public class MereClerk extends Employee {
	Manager manager;
	public MereClerk(String name, int salary, Manager manager) {
		super(name,salary);
		this.manager = manager;
	}
    public String getManagerName() {
    	return manager.getName();
    }
	void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
	}
	
}
