package chapter02.section03.printer;

public abstract class Printer {
	private String id;

	public Printer(String id) {
		super();
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void testPrinting() {
		print("testtest");
	}
	final void print(Object msg) {
		if(isPrintable()) {
			printing(msg);
		}else
			alert();
	};
	public abstract void printing(Object msg);
	public abstract boolean isPrintable();
	public abstract void alert();
}
