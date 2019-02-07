package carLots;

public class Truck extends Vehicle {
	public double bedSize;
	
	public Truck(String licenseNumber,String make,String model,String price, double bedSize) {
		super(licenseNumber,make,model,price);
		this.bedSize = bedSize;
	}

	public double getBedSize() {
		return bedSize;
	}

	public void setBedSize(double bedSize) {
		this.bedSize = bedSize;
	}
	public void printDescription() {
		super.printDescription();
		System.out.println(" Bed Size:" + this.bedSize);
	}
	
	
}