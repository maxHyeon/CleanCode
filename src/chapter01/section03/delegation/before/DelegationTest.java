package chapter01.section03.delegation.before;

abstract class Printer {
	private int id;

	public Printer(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	abstract void print(Object msg);
}

class LaserPrinter extends Printer {

	public LaserPrinter(int id) {
		super(id);

	}

	@Override
	void print(Object msg) {
		System.out.println("START PRINT WITH LASER");
		System.out.println(msg.toString());
		System.out.println("END PRINT WITH LASER");
	}

}

class DotPrinter extends Printer {

	public DotPrinter(int id) {
		super(id);

	}

	@Override
	void print(Object msg) {
		System.out.println("START PRINT WITH DOT");
		System.out.println(msg.toString());
		System.out.println("END PRINT WITH DOT");
	}

}

public class DelegationTest {
	public static void main(String args[]) {
		Printer printer = new DotPrinter(101);
		if(printer.getId()==101) {
			System.out.println("PRINT DOT");
			printer.print("hello print");
		}else if(printer.getId()==102) {
			System.out.println("RPINT LASER");
		}
		printer.print("helloprinter");
	}
}

