package toDoApp;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Controller {

	/* Member variables */
	private Doa Doa;
    private Scanner scanner;
    
    /* Constructor */
    
    public Controller(){
        this.Doa = new Doa();
    }
    //main method for the controller
	public static void main(String[] args) throws Exception {
		Controller c1 = new Controller();
		c1.start();
	}
    
	/*
	 * Runs the program
	 */
    public void start() throws Exception {
        printHelp(); // Print the action menu

        boolean quit = false;
        while(!quit) {

			// Prompt the user for input, collect input, parse into parts
            String input = promptString("> ");
			// Figure out what to do depending on the user's primary action
            System.out.println("'"+input+"'");
            if (input.equals("add")) {
            	Doa.add();

            } else if (input.equals("delete")) {
                Doa.delete();

            } 
            else if(input.equals("mark done")){
            	Doa.markComplete();
            	
            } else if (input.equals("list pending")) {

                Doa.listPending();

            } else if (input.equals("list done")) {

                Doa.listDone();

            } else if (input.equals("list all")) {

                Doa.listAll();

            }else if (input.equals("quit")) {

                quit = true;

            } else if (input.equals("help")) {

            	printHelp(); 

            } else if(input.length() ==0 ){
                  // do nothing.
                
            } else {
                System.out.println("[Error] Invalid action");
                
            }
        }

    }
	
	/*
	 * Prints the menu of actions to the console
	 */
    public static void printHelp(){
        System.out.println("Available functions: ");
        System.out.println("  add:            to add an item");
        System.out.println("  delete:         to delete an item");
        System.out.println("  mark done:      the item to mark as done");
        System.out.println("  list pending:   to list the pending items");
        System.out.println("  list done:      to list the done items");
        System.out.println("  list all:       to list all items");
        System.out.println("  help:        	  display available functions");
        System.out.println("  quit:           to exit");
        System.out.println();

    }
    //creates promt on console
    public String promptString(String label){
        System.out.print(label+" ");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
   