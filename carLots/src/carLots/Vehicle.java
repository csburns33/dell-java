package carLots;

public abstract class Vehicle {

	public String licenseNumber;
	public String make;
	public String model;
	public String price;
	
	public void printDescription() {
		System.out.println("License Number:"+this.licenseNumber + " Make:"+this.make+" Model:" + this.model + " Price:" + this.price);
	}
	
	public Vehicle(String licenseNumber, String make, String model, String price) {
		this.licenseNumber= licenseNumber;
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
