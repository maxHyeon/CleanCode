package chapter01.section03.delegation.lab;

import java.util.ArrayList;
import java.util.List;

public class FlexibleCompany {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new MereClerk("ö��", 100));
		empList.add(new MereClerk("����", 100));
		empList.add(new Manager("ȫ�浿", 200));
		empList.add(new StudentWorker("Min", 60));

		System.out.println("���� �����Դϴ�.");
		
		for (Employee employee : empList) {
			System.out.println(employee.getName() + "�� ���� ������ " + employee.getSalary() + " ���� �Դϴ�.");
		}
		
		System.out.println("�ø� ���� �����Դϴ�.");
		
		for (Employee employee : empList) {
			employee.manageSalary(10);
			System.out.println(employee.getName() + "�� ���� ������ " + employee.getSalary() + " ���� �Դϴ�.");
		}	
	}
}