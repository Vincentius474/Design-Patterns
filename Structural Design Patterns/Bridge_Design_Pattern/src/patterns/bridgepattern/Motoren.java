package patterns.bridgepattern;

public class Motoren extends Car{
	
	// Constructor
	public Motoren(Product product, String carType) {
		super(product, carType);
	}

	@Override
	public void assemble() {
		System.out.println("Assembling: " + product.productName() + " for " + carType);
	}

	@Override
	public void produceProduct() {
		product.produce();
		System.out.println("Modifing product " + product.productName() + " according to " + carType);
	}

}
