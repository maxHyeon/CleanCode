package chapter02.section03.company;

/*
 * ȸ����� ������ ����(�λ�, ����)�ϴ� ���α׷��� ������. ���� ȸ�翡 3���� ������ �ִٰ� �����Ѵ�.
 * �׵� �� �� ���� ����̸� ������ �� ����� �׵��� �������̴�.
 * ����� ����� ȸ�簡 �۾Ƽ� �������� �����ڴ� ���� ������ �����Ѵ�. 
 * �̵��� ���� ������ ����� 100����, �����ڴ� 200�����̴�. 
 * ����� ������ 10%��ŭ �λ��� ���̸�, �����ڴ� 20������ �� �÷��ش�. 
 * ������ �� ȸ�翡 �� ���� ������ ä��� ���̸�, �׵��� ���޵� �����Ǿ�� �Ѵ�. 
*/


public class CompanyExample {
	public static void main(String[] args) {
		Manager manager = new Manager("ȫ�浿", 200);
		MereClerk mereClerk1 = new MereClerk("ö��", 100, manager);
		MereClerk mereClerk2 = new MereClerk("yung", 100, manager);

		System.out.println("���� �����Դϴ�.");

		System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");
		System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");
		System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");

		System.out.println("");

		System.out.println("�ø� ���� �����Դϴ�.");

		mereClerk1.manageSalary(10);
		System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");

		mereClerk2.manageSalary(10);
		System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");

		manager.manageSalary(10);
		System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");

		System.out.println("");
		System.out.println(mereClerk1.getName() + "�� �Ŵ����� " + mereClerk1.getManagerName() + "�̴�.");
		System.out.println(mereClerk2.getName() + "�� �Ŵ����� " + mereClerk2.getManagerName() + "�̴�.");
	}
}
