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
		
		System.out.println("현재 월급입니다.");
		
		for (Employee employee : empList) {
			System.out.println(employee.getName() + "의 현재 월급은 " + employee.getSalary() + " 만원 입니다.");
		}
		
		System.out.println("올린 후의 월급입니다.");
		
		for (Employee employee : empList) {
			employee.manageSalary(10.0);
			System.out.println(employee.getName() + "의 현재 월급은 " + employee.getSalary() + " 만원 입니다.");
		}	
		
		System.out.println("chul promote mamager salary is");
		Employee chul = (Employee) empList.get(0);
		chul.setSalaryRole(new ManagerSalaryRole(200));
		chul.manageSalary(10.0);
		System.out.println(chul.getName()+"의 월급은"+chul.getSalary());
	}
}