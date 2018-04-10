package chapter01.section03.delegation.lab;

import java.util.ArrayList;
import java.util.List;

public class FlexibleCompany{

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee("chul");
		emp1.setSalaryRole(new MereClerkSalaryRole(100.0));
		empList.add(emp1);
		Employee emp2 = new Employee("yung");
		emp2.setSalaryRole(new MereClerkSalaryRole(100.0));
		empList.add(emp2);
		Employee emp3 = new Employee("min");
		emp3.setSalaryRole(new MereClerkSalaryRole(100.0));
		empList.add(emp3);
		Employee emp4 = new Employee("choi");
		emp4.setSalaryRole(new MereClerkSalaryRole(100.0));
		empList.add(emp4);
		
		System.out.println("���� �����Դϴ�.");
		
		for (Employee employee : empList) {
			System.out.println(employee.getName() + "�� ���� ������ " + employee.getSalary() + " ���� �Դϴ�.");
		}
		
		System.out.println("�ø� ���� �����Դϴ�.");
		
		for (Employee employee : empList) {
			employee.manageSalary(10.0);
			System.out.println(employee.getName() + "�� ���� ������ " + employee.getSalary() + " ���� �Դϴ�.");
		}	
		
		System.out.println("chul promote mamager salary is");
		Employee chul = (Employee) empList.get(0);
		chul.setSalaryRole(new ManagerSalaryRole(200));
		chul.manageSalary(10.0);
		System.out.println(chul.getName()+"�� ������"+chul.getSalary());
	}
}