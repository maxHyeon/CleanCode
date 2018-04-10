package chapter01.section03.delegation.lab;

import java.util.ArrayList;
import java.util.List;

public class FlexibleCompany {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new MereClerk("철수", 100));
		empList.add(new MereClerk("영희", 100));
		empList.add(new Manager("홍길동", 200));
		empList.add(new StudentWorker("Min", 60));

		System.out.println("현재 월급입니다.");
		
		for (Employee employee : empList) {
			System.out.println(employee.getName() + "의 현재 월급은 " + employee.getSalary() + " 만원 입니다.");
		}
		
		System.out.println("올린 후의 월급입니다.");
		
		for (Employee employee : empList) {
			employee.manageSalary(10);
			System.out.println(employee.getName() + "의 현재 월급은 " + employee.getSalary() + " 만원 입니다.");
		}	
	}
}