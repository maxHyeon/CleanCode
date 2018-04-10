package chapter02.section03.printer;

/*
 * ��ũ��, ��Ʈ, ������ �����Ϳ� PDF ���� �����⸦ �׽�Ʈ�ϴ� ���α׷��� ������. 
 * ��ũ��, ������ �����ʹ� �Ź� ����Ʈ�� ������ ���� ��ũ�� ��ʸ� �Һ��ϸ� ������ �Һ����� ���� �ٸ���.
 * ����Ϸ��� �������� ��ũ�� ����� �뷮�� �� ������ ���¿��� ����Ʈ�� �õ��ϸ� ��� �޽����� �����ش�.
 * �ݸ� ��Ʈ �����ʹ� �ݿ��������� ����� �� �ִ�. 
 * PDF ���� ������� ������ �̸��� PDF ������ �����ϰ� �� �ȿ� ���� ������ ����Ѵ�.
 * ���� ��ũ��(InkjetPrinter), ��Ʈ(DotPrinter), ������ ������(LaserPrinter) Ŭ������ 
 * PDF ������(PDFwWriter) Ŭ������ ������.
*/

class InkjetPrinter extends Printer {
	private double inkCapacity; // ��ũ�� �뷮
	private double inkReductionRate; // �ѹ� ����Ʈ�� ������ �پ��� ��ũ�� ����

	public InkjetPrinter(String ID) {
		super(ID);
		inkCapacity = 100;
		inkReductionRate = 0.5;
	}

	public void print(Object msg) {
		if (isPrintable()) {
			System.out.println("*��ũ�� ������� ����Ʈ�� �����մϴ�.*");
			System.out.println(msg.toString());
			System.out.println("*��ũ�� ������� ����Ʈ�� �����մϴ�.*");

			inkCapacity -= inkReductionRate;
		} else
			alert();
	}

	public void alert() {
		System.out.println("��ũ�� �����մϴ�. ���� ������ ���ڱ���~ ");
	}

	public boolean isPrintable() { // ����2�� ���� �з��� ����������,
		return (inkCapacity - inkReductionRate) >= 0;
	}
}

class DotPrinter extends Printer {
	public DotPrinter(String ID) {
		super(ID);
	}

	public void print(Object msg) {
		if (isPrintable()) {
			System.out.println("*��Ʈ ������� ����Ʈ�� �����մϴ�.*");
			System.out.println(msg.toString());
			System.out.println("*��Ʈ ������� ����Ʈ�� �����մϴ�.*");
		}
	}

	public boolean isPrintable() {
		return true;
	}
	
	public void alert() {		
	}
}

class LaserPrinter extends Printer {
	private double tonerCapacity; // ����� �뷮
	private double tonerReductionRate; // �ѹ� ����Ʈ�� ������ �پ��� ����� ����

	public LaserPrinter(String ID) {
		super(ID);
		tonerCapacity = 100;
		tonerReductionRate = 0.2;
	}

	public void print(Object msg) {
		if (isPrintable()) {
			System.out.println("*������ ������� ����Ʈ�� �����մϴ�.*");
			System.out.println(msg.toString());
			System.out.println("*������ ������� ����Ʈ�� �����մϴ�.*");

			tonerCapacity -= tonerReductionRate;
		} else
			alert();
	}

	public void alert() {
		System.out.println("��ʰ� �����մϴ�. ��� ������ ���ڱ���~ ");
	}

	public boolean isPrintable() { // ������ ���� �з��� ����������,
		return (tonerCapacity - tonerReductionRate) >= 0;
	}
}

class PDFWriter {
	private String fileName; // PDF ���� ���� �̸�

	public PDFWriter(String fileName) {
		this.fileName = fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void print(Object document) {
		System.out.println("*���������� " + fileName + " ���Ͽ� PDF �������� ����ϱ� �����մϴ�.*");
		System.out.println(document);
		System.out.println("*���������� PDF �������� ����� �Ϸ��߽��ϴ�.");
	}
}

public class PrinterExample {
	public static void main(String[] args) {
		InkjetPrinter iPrinter = new InkjetPrinter("101");
		DotPrinter dPrinter = new DotPrinter("102");
		LaserPrinter lPrinter = new LaserPrinter("103");
		PDFWriter pWriter = new PDFWriter("Test.pdf");

		iPrinter.print("ȯ���մϴ�. �����͸� �׽�Ʈ���Դϴ�.");
		System.out.println("");
		dPrinter.print("ȯ���մϴ�. �����͸� �׽�Ʈ���Դϴ�.");
		System.out.println("");
		lPrinter.print("ȯ���մϴ�. �����͸� �׽�Ʈ���Դϴ�.");
		System.out.println("");
		pWriter.print("ȯ���մϴ�. �����͸� �׽�Ʈ���Դϴ�.");
	}
}
