package chapter02.section03.company;

/*
 * 회사원의 봉급을 관리(인상, 인하)하는 프로그램을 만들자. 현재 회사에 3명의 직원이 있다고 가정한다.
 * 그들 중 두 명은 사원이며 나머지 한 사람은 그들의 관리자이다.
 * 참고로 현재는 회사가 작아서 관리자의 관리자는 없는 것으로 구현한다. 
 * 이들의 현재 월급은 사원은 100만원, 관리자는 200만원이다. 
 * 현재는 월급의 10%만큼 인상할 것이며, 관리자는 20만원을 더 올려준다. 
 * 앞으로 이 회사에 더 많은 직원이 채용될 것이며, 그들의 월급도 관리되어야 한다. 
*/


public class CompanyExample {
	public static void main(String[] args) {
		Manager manager = new Manager("홍길동", 200);
		MereClerk mereClerk1 = new MereClerk("철수", 100, manager);
		MereClerk mereClerk2 = new MereClerk("yung", 100, manager);

		System.out.println("현재 월급입니다.");

		System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
		System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
		System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

		System.out.println("");

		System.out.println("올린 후의 월급입니다.");

		mereClerk1.manageSalary(10);
		System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");

		mereClerk2.manageSalary(10);
		System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");

		manager.manageSalary(10);
		System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");

		System.out.println("");
		System.out.println(mereClerk1.getName() + "의 매니저는 " + mereClerk1.getManagerName() + "이다.");
		System.out.println(mereClerk2.getName() + "의 매니저는 " + mereClerk2.getManagerName() + "이다.");
	}
}
