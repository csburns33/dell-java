package timesheet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Controller {

	/* Member variables */
	
    Timesheet timesheet;
    ConsoleUtils consoleUtils;
    
    /* Constructor */
    
    public Controller(){
        this.timesheet = new Timesheet();
        this.consoleUtils = new ConsoleUtils();
    }
    
    /* Methods */

	/*
	 * Runs the program
	 */
    public void start() throws Exception {

        consoleUtils.printHelp(); // Print the action menu

        boolean quit = false;
        while(!quit) {

			// Prompt the user for input, collect input, parse into parts
            String input = consoleUtils.promptString("> ");
            String[] actionParts = input.split(" ");
            String action = actionParts[0].trim(); // Primary action

			// Figure out what to do depending on the user's primary action
            if (action.equals("add")) {

                processAddAction();
                System.out.println("[Record successfully added]");

            } else if (action.equals("delete")) {

                processDeleteAction(actionParts);
                System.out.println("[Record successfully deleted]");

            } else if (action.equals("stop")) {

                processStopAction(actionParts);
                System.out.println("[Record successfully stopped]");

            } else if (action.equals("list")) {

                processListAction(actionParts);

            } else if (action.equals("quit")) {

                quit = true;

            } else if (action.equals("help")) {

            	consoleUtils.printHelp(); 

            } else if(action.length() ==0 ){
            
                // do nothing.
                
            } else {
            
                // Your code here
                
            }
        }

    }

	/*
	 * The user requested that a given TimesheetEntry be stopped (marked as complete)
	 * This method conveys that request to the Timesheet
	 */
    public void processStopAction(String[] actionParts) throws Exception{

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to stop command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);
        TimesheetEntry t1 = timesheet.get(id);
        timesheet.stop(t1);
        

		// Your code here
    }

	/*
	 * The user requested that a given TimesheetEntry be deleted
	 * This method conveys that request to the Timesheet
	 */
    public void processDeleteAction(String[] actionParts){

        if(actionParts.length > 2){
            consoleUtils.error("Too many inputs to delete command");
            return;
        }

        int id = Integer.parseInt(actionParts[1]);
        TimesheetEntry t1 = timesheet.get(id);
        timesheet.delete(t1);
		
		// Your code here
    }

	/*
	 * The user wants to view a list of timesheet entries
	 * This method conveys that request to the Timesheet,
	 * along with any special options (active-only, filter by project name)
	 */
    public void processListAction(String[] actionParts){
    	List<TimesheetEntry> entries = new ArrayList<TimesheetEntry>();
    	
        if(actionParts.length > 3){
            consoleUtils.error("Too many inputs to list command");
            return;
        }
        if (actionParts.length == 1) {
        	entries = timesheet.list(false);
        }
        else if (actionParts.length == 2) {
        	if (actionParts[1].equals("-a")) {
        		entries = timesheet.list(true);
        	}
        	else {
        		System.out.println("what is actions w " + actionParts[1]);
        		entries = timesheet.list(actionParts[1]);
        	}  	
        }
        else if (actionParts.length == 3) {
    		if (actionParts[1].equals("-a")) {
    			entries = timesheet.list(true,actionParts[2]);
    		}
    		else { 
    			entries = timesheet.list(true,actionParts[1]);
    		}
        }
		Iterator<TimesheetEntry> iter = entries.iterator();
		while(iter.hasNext()) {
			TimesheetEntry t1 = iter.next();
			System.out.println("| " + t1.getId() +" | " + t1.getProjectName() + " | " + t1.getTask() + " | "  +  t1.getStartTime() + " | " + t1.getEndTime());
		}
        
        
    }



	/*
	 * The user wants to add a new entry to the Timesheet
	 * This method conveys that request to the Timesheet, along with
	 * the specified project name and task description 
	 */
    public void processAddAction(){
    
        String project = consoleUtils.promptString("Project Name (one word only):");
        String description = consoleUtils.promptString("Task:");
        
        timesheet.add(project, description);
		// Your code here
    }
}