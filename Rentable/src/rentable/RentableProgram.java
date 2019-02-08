package rentable;

import java.util.ArrayList;
import java.util.Scanner;


public class RentableProgram {

	//instatiates different instances of room,condo, and tool and print their daily rates
	public static void main(String[] args) {
	
		Room r1 = new Room("Room 1", 70.00);
		Room r2 = new Room("Room 2", 150.00);
		Room r3 = new Room("Room 3", 370.00);
		Room r4 = new Room("Honeymoon Suite", 600.00);
		
		Condo c2 = new Condo("Small Condo", 550.00);
		Condo c1 = new Condo("Big Condo", 700.00);
		Condo c3 = new Condo("Mansion Condo", 3000.00);
		
		Tool t1 = new Tool("hammer", 10.00);
		Tool t2 = new Tool("screwdriver", 8.00);
		Tool t3 = new Tool("Drill", 14.00);
		
		Rentable[] arrayOfRentables = {r1, r2, r3, r4, c1, c2, c3, t1, t2, t3};
		
		for (int i = 0; i < arrayOfRentables.length; i++) {
			
			String rate = "$" + String.format("%.2f", arrayOfRentables[i].getDailyRate());
			System.out.println(arrayOfRentables[i].getDescription() + ": " +  rate);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many days would you like to rent these items?");
	    Double numDays  = Double.parseDouble(sc.nextLine());
		System.out.println("Ok. To rent each of these items for " + numDays.intValue() + " days, that would cost, ");
		for (int i = 0; i < arrayOfRentables.length; i++) {
			
			String rate = "$" + String.format("%.2f", arrayOfRentables[i].getPrice(numDays));
			System.out.println(arrayOfRentables[i].getDescription() + ": " +  rate);
		}
		
		
	}
	
}
