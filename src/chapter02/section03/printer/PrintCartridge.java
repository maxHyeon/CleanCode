package chapter02.section03.printer;

class PrintCartridge {
	private double capacity;
	private double reductionRate;
	public PrintCartridge(double capacity, double reductionRate) {
		super();
		this.capacity = capacity;
		this.reductionRate = reductionRate;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public double getReductionRate() {
		return reductionRate;
	}
	

}
