package patterns.bridgepattern;

public class CentralLocking implements Product {

	// Attributes
	private final String productName;
	
	// Constructor
	public CentralLocking(String productName) {
		this.productName = productName;
	}
	
	@Override
	public String productName() {
		return productName;
	}

	@Override
	public void produce() {
		System.out.println("Producing Central Locking System");
	}

}
