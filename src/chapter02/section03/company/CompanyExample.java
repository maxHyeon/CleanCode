package chapter02.section03.company;

/*
 * ȸ����� ������ ����(�λ�, ����)�ϴ� ���α׷��� ������. ���� ȸ�翡 3���� ������ �ִٰ� �����Ѵ�.
 * �׵� �� �� ���� ����̸� ������ �� ����� �׵��� �������̴�.
 * ����� ����� ȸ�簡 �۾Ƽ� �������� �����ڴ� ���� ������ �����Ѵ�. 
 * �̵��� ���� ������ ����� 100����, �����ڴ� 200�����̴�. 
 * ����� ������ 10%��ŭ �λ��� ���̸�, �����ڴ� 20������ �� �÷��ش�. 
 * ������ �� ȸ�翡 �� ���� ������ ä��� ���̸�, �׵��� ���޵� �����Ǿ�� �Ѵ�. 
*/
class Employee {
	static final int CLERK = 1;
	static final int MANAGER = 2;

	private String name;
	private double salary;
	private int type;
	private Employee manager;

	public Employee(int type, String name, double salary, Employee manager) {
		this.type = type;
		this.name = name;
		this.salary = salary;
		this.manager = manager;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	public Employee getManager() {
		return manager;
	}

	public void manageES(double rate) {
		if (type == CLERK) {
			salary = salary + salary * (rate / 100);
		} else if (type == MANAGER) {
			salary = salary + salary * (rate / 100);
			salary += 20; // �����ڴ� 20������ �߰��� �޴´�.
		}
	}
}

public class CompanyExample {
	public static void main(String[] args) {

		Employee manager = new Employee(Employee.MANAGER, "ȫ�浿", 200, null);
		Employee mereClerk1 = new Employee(Employee.CLERK, "ö��", 100, manager);
		Employee mereClerk2 = new Employee(Employee.CLERK, "����", 100, manager);

		System.out.println("���� �����Դϴ�.");

		System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");
		System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");
		System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");

		System.out.println("");

		System.out.println("�ø� ���� �����Դϴ�.");

		mereClerk1.manageES(10);
		System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");

		mereClerk2.manageES(10);
		System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");

		manager.manageES(10);
		System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");

		System.out.println("");
		System.out.println(mereClerk1.getName() + "�� �Ŵ����� " + mereClerk1.getManager().getName() + "�̴�.");
		System.out.println(mereClerk2.getName() + "�� �Ŵ����� " + mereClerk2.getManager().getName() + "�̴�.");

	}
}
