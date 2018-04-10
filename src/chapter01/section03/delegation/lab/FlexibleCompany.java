package chapter01.section03.delegation.lab;

public class FlexibleCompany {
	public static void main(String[] args) {
		MereClerk mereClerk1 = new MereClerk("ö��", 100);
		MereClerk mereClerk2 = new MereClerk("����", 100);
		Manager manager = new Manager("ȫ�浿", 200);
		StudentWorker studentworker = new StudentWorker("Min", 60);

		System.out.println("���� �����Դϴ�.");
		System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");
		System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");
		System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");
		System.out.println(studentworker.getName() + "�� ���� ������ " + studentworker.getSalary() + " ���� �Դϴ�.");

		System.out.println("");

		System.out.println("�ø� ���� �����Դϴ�.");
		mereClerk1.manageSalary(10);
		System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");

		mereClerk2.manageSalary(10);
		System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");

		manager.manageSalary(10);
		System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");
		
		studentworker.manageSalary(10);
		System.out.println(studentworker.getName() + "�� ���� ������ " + studentworker.getSalary() + " ���� �Դϴ�.");
	}
}