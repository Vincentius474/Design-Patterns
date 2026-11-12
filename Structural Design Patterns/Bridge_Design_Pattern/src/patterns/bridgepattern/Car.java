package patterns.bridgepattern;

public abstract class Car {

	// Attributes
	protected final Product product;
	protected final String carType;
	
	// Constructor
	public Car(Product product, String carType) {
		this.product = product;
		this.carType = carType;
	}
	
	public abstract void assemble();
	public abstract void produceProduct();
	
	public void printDetails() {
		System.out.println("Car: " + carType + ", Product: " + product.productName());
	}
	
}
