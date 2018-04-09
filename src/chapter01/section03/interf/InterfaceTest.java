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
		System.out.println("---> DotPrinter�� ����Ѵ�.");
	}	
}
class InkjetPrinter extends Printer implements Printable {
	public void print() {
		System.out.println("---> InkjetPrinter�� ����Ѵ�.");
	}	
}
class PolaroidCamera extends Camera implements Printable {
	public void print() {
		System.out.println("---> PolaroidCamera�� ����Ѵ�.");
	}	
}
public class InterfaceTest {
	public static void main(String[] args) {
		Printable printerable = new DotPrinter();
		printerable.print();
	}
}
