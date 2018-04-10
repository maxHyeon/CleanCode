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

class InkjetPrinter {
	private double inkCapacity; // ��ũ�� �뷮
	private double inkReductionRate; // �ѹ� ����Ʈ�� ������ �پ��� ��ũ�� ����

	private String ID;

	public InkjetPrinter(String ID) {
		this.ID = ID;
		inkCapacity = 100;
		inkReductionRate = 0.5;
	}

	public String getID() {
		return ID;
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

	public boolean isPrintable() { // ������ ���� �з��� ����������,
		return (inkCapacity - inkReductionRate) >= 0;
	}

	public void testPrinting() {
		print("�ƾ�~ ����Ʈ �׽�Ʈ. ����Ʈ �׽�Ʈ");
	}
}

class DotPrinter {
	private String ID;

	public DotPrinter(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
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

	public void testPrinting() {
		print("�ƾ�~ ����Ʈ �׽�Ʈ. ����Ʈ �׽�Ʈ");
	}
}

class LaserPrinter {
	private double tonerCapacity; // ����� �뷮
	private double tonerReductionRate; // �ѹ� ����Ʈ�� ������ �پ��� ����� ����

	private String ID;

	public LaserPrinter(String ID) {
		this.ID = ID;
		tonerCapacity = 100;
		tonerReductionRate = 0.2;
	}

	public String getID() {
		return ID;
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

	public void testPrinting() {
		print("�ƾ�~ ����Ʈ �׽�Ʈ. ����Ʈ �׽�Ʈ");
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
		dPrinter.print("ȯ���մϴ�. �����͸� �׽�Ʈ���Դϴ�.");
		lPrinter.print("ȯ���մϴ�. �����͸� �׽�Ʈ���Դϴ�.");
		pWriter.print("ȯ���մϴ�. �����͸� �׽�Ʈ���Դϴ�.");
	}
}
