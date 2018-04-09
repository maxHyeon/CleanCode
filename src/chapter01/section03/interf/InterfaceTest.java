package chapter01.section03.interf;

interface Printable {
	public void print();
}
abstract class Printer {
}
abstract class Camera {
}
class DotPrinter extends Printer implements Printable {
	public void print() {
		System.out.println("---> DotPrinter로 출력한다.");
	}	
}
class InkjetPrinter extends Printer implements Printable {
	public void print() {
		System.out.println("---> InkjetPrinter로 출력한다.");
	}	
}
class PolaroidCamera extends Camera implements Printable {
	public void print() {
		System.out.println("---> PolaroidCamera로 출력한다.");
	}	
}
public class InterfaceTest {
	public static void main(String[] args) {
		Printable printerable = new DotPrinter();
		printerable.print();
	}
}
