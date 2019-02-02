package parkingGarage;

public class ParkingGarage {
	int capacity;
	private Car[] carArray;
	
	//Parking Garage constructor
	public ParkingGarage(int myCapacity) {
		capacity = myCapacity;
		carArray = new Car[capacity];
		
	}
	
	//Takes car parameter it in carArray at index of spot
	public void park(Car car, int spot) {
		try {
			carArray[spot] = car;
		}catch(Exception ex) {
			System.out.println(ex + " There is already a car in spot: " + spot);
		}
	}
	
	//Sets carArray index of spot to null
	public void vacate(int spot) {
		if (carArray[spot] == null) {
			System.out.println("There is no car present in spot: " + spot);	
		} else {
			carArray[spot] = null;
		}
	}
	
	//prints all the cars in the garage
	public void printInventory() {
		for (int i=0; i<carArray.length-1; i++) {
			if (carArray[i] != null) {
				System.out.println("In spot: " + i + " is a "+ carArray[i].Color + " " + carArray[i].Make + " " + carArray[i].Model + " License: " + carArray[i].LicenseNo);
			}
		}
		
	
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Car[] getCarArray() {
		return carArray;
	}

	public void setCarArray(Car[] carArray) {
		this.carArray = carArray;
	}
}
