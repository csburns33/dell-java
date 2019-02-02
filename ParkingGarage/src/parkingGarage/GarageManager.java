package parkingGarage;

public class GarageManager {

	
	public static void main(String[] args) {
		Car c1 = new Car("Black", "XPM2019", "Ford", "Escape");
		Car c2 = new Car("Red", "PPPPP", "Kia", "Sol");
		Car c3 = new Car("Green", "TTLM10", "Toyota", "Prius");
		Car c4 = new Car("Red", "LMNOP", "Chevy", "Traverse");

		System.out.println("In parking garage 1: ");
		ParkingGarage p1 = new ParkingGarage(10);
		p1.park(c1, 1);
		p1.park(c2, 2);
		p1.park(c3, 3);
		
		p1.vacate(6);
		p1.vacate(3);
		
		p1.printInventory();
		
		System.out.println("In parking garage 2: ");
		ParkingGarage p2 = new ParkingGarage(3);
		p2.park(c1, 1);
		p2.park(c3, 0);
		
		p2.vacate(0);
		p2.vacate(2);
		
		p2.printInventory();
		
		System.out.println("In parking garage 3: ");
		ParkingGarage p3 = new ParkingGarage(3);
		p3.park(c1, 1);
		p3.park(c3, 1);
		
		p3.vacate(0);
		
		p3.printInventory();
		
		
		
		
		
		
		

	}
}
