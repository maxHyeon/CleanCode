package chapter02.section03.printer;

/*
 * 잉크젯, 도트, 레이저 프린터와 PDF 파일 생성기를 테스트하는 프로그램을 만들어보자. 
 * 잉크젯, 레이저 프린터는 매번 프린트할 때마다 각각 잉크와 토너를 소비하며 각각의 소비율은 서로 다르다.
 * 사용하려는 프린터의 잉크나 토너의 용량이 다 떨어진 상태에서 프린트를 시도하면 경고 메시지를 보여준다.
 * 반면 도트 프린터는 반영구적으로 사용할 수 있다. 
 * PDF 파일 생성기는 지정된 이름의 PDF 파일을 생성하고 그 안에 문서 내용을 출력한다.
 * 먼저 잉크젯(InkjetPrinter), 도트(DotPrinter), 레이저 프린터(LaserPrinter) 클래스와 
 * PDF 생성기(PDFwWriter) 클래스를 만들자.
*/

class InkjetPrinter extends Printer {

	PrintCartridge cartridge;

	public InkjetPrinter(String ID) {
		super(ID);
		cartridge = new PrintCartridge(100, 0.5);
	}

	public void alert() {
		System.out.println("잉크가 부족합니다. 빨간 램프를 깜박깜박~ ");
	}

	public boolean isPrintable() { // 한장2을 찍을 분량이 남아있으면,
		return (cartridge.isAvailable());
	}

	public void printing(Object msg) {
		System.out.println("*잉크젯 방식으로 프린트를 시작합니다.*");
		System.out.println(msg.toString());
		System.out.println("*잉크젯 방식으로 프린트를 종료합니다.*");
		cartridge.consume();
	}
}

class DotPrinter extends Printer {
	public DotPrinter(String ID) {
		super(ID);
	}

	public boolean isPrintable() {
		return true;
	}

	public void alert() {
	}

	public void printing(Object msg) {
		System.out.println("*도트 방식으로 프린트를 시작합니다.*");
		System.out.println(msg.toString());
		System.out.println("*도트 방식으로 프린트를 종료합니다.*");
	}
}

class LaserPrinter extends Printer {
	PrintCartridge cartridge;

	public LaserPrinter(String ID) {
		super(ID);
		cartridge = new PrintCartridge(100, 0.2);
	}

	public void alert() {
		System.out.println("토너가 부족합니다. 노란 램프를 깜박깜박~ ");
	}

	public boolean isPrintable() { // 한장을 찍을 분량이 남아있으면,
		return (cartridge.isAvailable());
	}

	public void printing(Object msg) {
		System.out.println("*레이저 방식으로 프린트를 시작합니다.*");
		System.out.println(msg.toString());
		System.out.println("*레이저 방식으로 프린트를 종료합니다.*");
		cartridge.consume();
	}
}

class PDFWriter {
	private String fileName; // PDF 문서 파일 이름

	public PDFWriter(String fileName) {
		this.fileName = fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void print(Object document) {
		System.out.println("*문서내용을 " + fileName + " 파일에 PDF 포맷으로 출력하기 시작합니다.*");
		System.out.println(document);
		System.out.println("*문서내용을 PDF 포맷으로 출력을 완료했습니다.");
	}
}

public class PrinterExample {
	public static void main(String[] args) {
		InkjetPrinter iPrinter = new InkjetPrinter("101");
		DotPrinter dPrinter = new DotPrinter("102");
		LaserPrinter lPrinter = new LaserPrinter("103");
		PDFWriter pWriter = new PDFWriter("Test.pdf");

		iPrinter.print("환영합니다. 프린터를 테스트중입니다.");
		System.out.println("");
		dPrinter.print("환영합니다. 프린터를 테스트중입니다.");
		System.out.println("");
		lPrinter.print("환영합니다. 프린터를 테스트중입니다.");
		System.out.println("");
		pWriter.print("환영합니다. 프린터를 테스트중입니다.");
	}
}
