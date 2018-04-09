package chapter01.section03.casting;

class A {
	int a = 10;
	public void methodA1() {
		System.out.println("A클래스 methodA1()");
	}

	public void methodA2() {
		System.out.println("A클래스 methodA2()");
	}

	public void methodA3() {
		System.out.println("A클래스 methodA3()");
	}
}

class B extends A {
	int a = 20;
	public void methodA1() {
		System.out.println("B클래스 methodA1()");
	}

	public void methodB1() {
		System.out.println("B클래스 methodB1()");
	}

	public void methodB2() {
		System.out.println("B클래스 methodB1()");
	}
}

public class ClassCastingTest {
	public static void main(String[] argv) {
		A a = new A(); 
		a.methodA1(); 
		
		A b = new B(); //묵시적형변환 
		b.methodA1(); 
		System.out.println("a : "+b.a);

		((B) b).methodB1(); 
	}
}