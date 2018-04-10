package chapter02.section03.printer;

class PrintCartridge {
	private double capacity;
	private double reductionRate;
	public PrintCartridge(double capacity, double reductionRate) {
		super();
		this.capacity = capacity;
		this.reductionRate = reductionRate;
	}
	public double getReductionRate() {
		return reductionRate;
	}
	public boolean isAvailable() {
		return capacity - reductionRate >= 0;
	}
	public void consume() {
		capacity -= reductionRate;
	}
}
