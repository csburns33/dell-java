package carLots;

public class Car extends Vehicle{
	private static String[] typeOptions = {"coupe", "hatchback", "sedan"};
	private String type;
	private int numDoors;
	
	public Car(String licenseNumber, String make, String model, String price, String type, int numDoors) {
		
		super(licenseNumber, make, model, price);
		//type = Car.typeOptions[0];
		this.type = type;
		this.numDoors = numDoors;
		
	}
	
	public void printDescription() {
		super.printDescription();
		System.out.println("Number of doors:" + this.numDoors + " Type: " + this.type);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumDoors() {
		return this.numDoors;
	}

	public void setNumDoors(int numDoors) {
		numDoors = this.numDoors;
	}
	

	
	
}
