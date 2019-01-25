

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    try {
	    	System.out.println("Rock, Paper, or Scissors?");
		    String theirHand = sc.nextLine();
		    checkUserInput(theirHand);
	    } catch(Exception e) {
	    	System.out.println("You need to enter Rock, Paper, or Scissors")
	    }
	    String myHand = calculateMyHand();
	    System.out.println("Computer said " + myHand);
	    System.out.println("You said " + theirHand);    
	    System.out.println(calculateWhoWon(myHand, theirHand)+ " won!");
	    
	}
	public static void checkUserInput(String input) {
		if (!(input.equalsIgnoreCase("Rock")||input.equalsIgnoreCase("Paper")|| input.equalsIgnoreCase("Scissors")||input.equalsIgnoreCase("sissors"))){
			throw new IllegalArgumentException();
		};
	}
	
	public static String calculateMyHand() {
		Random rand = new Random();
		String myHand = "";
		int rand1 = rand.nextInt(3);
		if (rand1 == 0) {
			myHand = "Paper";
		} else if(rand1 == 1){
			myHand = "Rock";
		} else if(rand1 == 2){
			myHand = "Scissors";
		}
		return myHand;
		
	}
	
	public static String calculateWhoWon(String myHand, String theirHand) {
		String winner = "tie";
		if (theirHand.equals("rock") || theirHand.equals("Rock")) {
			if (myHand.equals("Paper")) {
				winner = "computer";
			} else if (myHand.equals("Scissors")) {
				winner = "you";
			}
		} else if (theirHand.equals("paper") || theirHand.equals("Paper")) {
			if (myHand.equals("Scissors")) {
				winner = "computer";
			} else if (myHand.equals("Rock")) {
				winner = "you";
			}
		} else if (theirHand.equals("scissors") || theirHand.equals("Scissors")) {
			if (myHand.equals("Paper")) {
				winner = "you";
			} else if (myHand.equals("Rock")) {
				winner = "computer";
			}
		}
		return winner;
	}
}
