package patterns.bridgepattern;

public class GearLocking implements Product {
	
	// Attributes
	private final String productName;
	
	// Constructor
	public GearLocking(String productName) {
		this.productName  = productName;
	}

	@Override
	public String productName() {
		return productName;
	}

	@Override
	public void produce() {
		System.out.println("Producing Gear Locking System");
	}

}
