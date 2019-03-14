package toDoApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Doa {

	public ArrayList<ToDoItem> database = new ArrayList<ToDoItem>();
	private int id = 1;

	//this marks an item complete based on its ID
	public void markComplete() {
		boolean exists =false;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an item ID: ");
        int myId = Integer.parseInt(sc.nextLine());	
		for (int i=0; i<database.size(); i++) {
			if(database.get(i).getId() == myId) {
				database.get(i).setCompletedFlag(true);
				System.out.println("[item updated]");
				exists = true;
			}
		}
		if (exists == false) {
			System.out.println("[Error] could not find item");
		}
	}
	
	//this adds a to-do item to the arraylist
	public void add() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a description: ");
        String descr = sc.nextLine();
        ToDoItem t1 = new ToDoItem(id, descr, false);
        t1.printItem();
        database.add(t1);
		System.out.println("\n[item added]");
	}
	
	//this deletes an item from the array list based on item ID
	public void delete() {
		boolean exists =false;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an item Id: ");
        int myId = Integer.parseInt(sc.nextLine());	
		for (int i=0; i<database.size(); i++) {
			if(database.get(i).getId() == myId) {
				System.out.println("ID: " + myId );
				System.out.println("Description: " + database.get(i).getDescription() );
				if (database.get(i).isCompletedFlag() == true) {
					System.out.println("Status: done");
				}else {
					System.out.println("Status: pending");
				}
				database.remove(i);
				System.out.println("[item deleted]");
				exists = true;
			}
		}
		if (exists == false) {
			System.out.println("[Error] could not find item");
		}
		
	}
	
	//prints all items that are not done
	public void listPending() {
		int counter = 0;
		for (int i=0; i<database.size(); i++) {
			if(database.get(i).isCompletedFlag() == false) {
				System.out.println("| " + database.get(i).getId() +" | " +database.get(i).getDescription() + " | " + database.get(i).isCompletedFlag());
				counter++;
			}
		}
		System.out.println("["+counter+ " entries]");
	}
	
	//prints all items that ARE done
	public void listDone() {
		int counter = 0;
		for (int i=0; i<database.size(); i++) {
			if(database.get(i).isCompletedFlag() == true) {
				System.out.println("| " + database.get(i).getId() +" | " +database.get(i).getDescription() + " | " + database.get(i).isCompletedFlag());
				counter++;
			}
		}
		System.out.println("["+counter+ " entries]");
	}
	//prints out all items
	public void listAll() {
		int counter = 0;
		for (int i=0; i<database.size(); i++) {
			System.out.println("| " + database.get(i).getId() +" | " +database.get(i).getDescription() + " | " + database.get(i).isCompletedFlag());
			counter++;
		}
		System.out.println("["+counter+ " entries]");
	}
}
