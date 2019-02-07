package carLots;

import java.util.ArrayList;
import java.util.Arrays;

public class CarLotProgram {

	public static void main(String[] args) {

		
		Car c1 = new Car("xpa1234", "Ford","escape", "30000", "hatchback", 4);
		//c1.printDescription();
		Car c2 = new Car("hiiiii", "bmw","mini cooper", "30000", "coupe", 4);
		Car c3 = new Car("rstuv", "kia","sol", "18000", "hatchback", 4);
		Car c4 = new Car("lmnopq", "toyota","prius", "40000", "sedan", 4);
		Car c5 = new Car("plms1if", "chev","malibu", "2000", "sedan", 2);
		
		Truck t1 = new Truck("83msjd", "Ford", "Truck", "32000", 36.0);
		Truck t2 = new Truck("myplate", "Ram", "Taurus", "40000", 26.0);
			

		ArrayList<Vehicle> listofVehicles =new ArrayList<Vehicle>();

		CarLot carLot1 = new CarLot("My Fancy Car Lot", listofVehicles);
		carLot1.addVehicle(t2);
		carLot1.addVehicle(c1);
		carLot1.addVehicle(c5);
		
		

		CarLot carLot2 = new CarLot("My Second Car Lot", listofVehicles);
		carLot2.addVehicle(t2);
		carLot2.addVehicle(c2);
		carLot2.addVehicle(c3);
		
		CarLot carLot3 = new CarLot("My Third Car Lot", listofVehicles);
		carLot3.addVehicle(t1);
		carLot3.addVehicle(t2);
		carLot3.addVehicle(c5);
		carLot3.addVehicle(c3);
		
		carLot1.printInventory();
		carLot2.printInventory();
		carLot3.printInventory();
	
	

	
	}

}
