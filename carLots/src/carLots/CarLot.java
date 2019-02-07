package carLots;

import java.awt.List;
import java.util.ArrayList;

public class CarLot {
	
	String name;
	public ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();


	public CarLot(String name, ArrayList listOfVehicles) {
		this.name = name;
		this.listOfVehicles = listOfVehicles;
	}

	public void addVehicle(Vehicle myVehicle) {
		listOfVehicles.add(myVehicle);
	}
	
	public void printInventory() {
		
		System.out.println("There are " + listOfVehicles.size() + " vehicles in the lot: " + name);
		for (int i = 0; i<listOfVehicles.size();i++) {
			Vehicle v = listOfVehicles.get(i);
			System.out.println("Vehicle " + i + ": ");
			v.printDescription();
			//System.out.println(v.getLicenseNumber());
			//v.printDescription(v.licenseNumber, v.make, v.model, v.price);
		}
	}
}
 