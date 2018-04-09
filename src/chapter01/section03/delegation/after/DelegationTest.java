package chapter01.section03.delegation.after;

abstract class PrinterImpl {
	private String id;

	public PrinterImpl(String id) {
		this.id = id;
	}

	public int getId() {
		return Integer.parseInt(id);
	}

	abstract void print(Object msg);
}

class DotPrinterImpl extends PrinterImpl {

	public DotPrinterImpl(String id) {
		super(id);

	}

	@Override
	void print(Object msg) {
		System.out.println("START PRINT WITH DOT");
		System.out.println(msg.toString());
		System.out.println("END PRINT WITH DOT");
	}

}

class LaserPrinterImpl extends PrinterImpl {

	public LaserPrinterImpl(String id) {
		super(id);

	}

	@Override
	void print(Object msg) {
		System.out.println("START PRINT WITH LASER");
		System.out.println(msg.toString());
		System.out.println("END PRINT WITH LASER");
	}

}
class Printer {
	private PrinterImpl printerImpl;

	public Printer(PrinterImpl printerImpl) {
		super();
		this.printerImpl = printerImpl;
	}
	public String getId() {
		return new Integer(printerImpl.getId()).toString();
	}
	public void print(Object message) {
		printerImpl.print(message);
	}
}
public class DelegationTest {
	public static void main(String[] args) {
		Printer printer = new Printer(new LaserPrinterImpl("102"));
		
		if(printer.getId().equals("101")) {
			System.out.println("PRINT DOT");
		}else if(printer.getId().equals("102")) {
			System.out.println("PRINT LASER");
		}
		printer.print("hello printer");
	}
}