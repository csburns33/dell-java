package ticTacToe;

import java.util.Scanner;

public class TicTacToe {

	static String player = "X";
	static String[][] boardArray = new String[3][3];
	static boolean winner = false; 
	static int playCount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		boardArray = createBoard();
	    displayBoard();

		while (winner == false) {
			System.out.println("It is player " + whichPlayer() + "'s turn.");
			askForMove();
			playCount++; 
			if (playCount == 9) {
				System.out.println("It is a tie");
				winner = true; 
			}
	    }
	}
	public static String[][] createBoard() {
		for (int i=0; i<3; i++) {
			for (int j=0;j<3;j++) {
				boardArray[i][j] = " ";
			}
		}
		return boardArray;
	}
	
    public static void displayBoard() {
        for (int i = 0; i < boardArray.length; i++) {
            for (int j = 0; j < boardArray[i].length; j++) {
            	if (j == boardArray[i].length - 1) System.out.print(boardArray[i][j]);
            	else { 
            		System.out.print( boardArray[i][j] + " | ");
            	}
            }
            System.out.println();
        }
    }
	public static void askForMove() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What row?");
	    String row = sc.nextLine();
	    int rowNum = Integer.parseInt(row);
	    checkIfValidRow(rowNum);
	    System.out.println("What column?");
	    String col = sc.nextLine();
	    int colNum = Integer.parseInt(col);
	    checkIfValidCol(colNum);
	    checkIfEmptySpace(rowNum,colNum);
		
	}
	public static void checkIfEmptySpace(int row, int col) {
		
		if (boardArray[row][col] == " ") {
			movePlayer(row, col);
			
		}
		else {
			System.out.println("Sorry that is an invalid move.");
			askForMove();
		}
	}
	public static void movePlayer(int row, int col) {
		boardArray[row][col] = player;
		displayBoard();
		checkIfWin();
		
	}
	
	public static void checkIfWin() {
		//horizontal win
		if (boardArray[0][0] == boardArray[0][1] && boardArray[0][1] == boardArray[0][2]) {
			if (boardArray[0][0] == "O" || boardArray[0][0] == "X") {
				System.out.println("Player " + boardArray[0][0] + " wins!");
				winner = true;
			}
		}else if (boardArray[1][0] == boardArray[1][1] && boardArray[1][1] == boardArray[1][2]) {
			if (boardArray[1][0] == "O" || boardArray[1][0] == "X") {
				System.out.println("Player " + boardArray[1][0] + " wins!");
				winner = true;
			}
		}else if (boardArray[2][0] == boardArray[2][1] && boardArray[2][1] == boardArray[2][2]) {
			if (boardArray[2][0] == "O" || boardArray[2][0] == "X") {
				System.out.println("Player " + boardArray[2][0] + " wins!");
				winner = true;
			}
		} //vertical win
		else if (boardArray[0][0] == boardArray[1][0] && boardArray[1][0] == boardArray[2][0]) {
			if (boardArray[0][0] == "O" || boardArray[0][0] == "X") {
				System.out.println("Player " + boardArray[0][0] + " wins!");
				winner = true;
			}
		}else if (boardArray[0][1] == boardArray[1][1] && boardArray[1][1] == boardArray[2][1]) {
			if (boardArray[0][1] == "O" || boardArray[0][1] == "X") {
				System.out.println("Player " + boardArray[0][1] + " wins!");
				winner = true;
			}		
		}else if (boardArray[0][2] == boardArray[1][2] && boardArray[1][2] == boardArray[2][2]) {
			if (boardArray[0][2] == "O" || boardArray[0][2] == "X") {
				System.out.println("Player " + boardArray[0][2] + " wins!");
				winner = true;
			}
		}//diagonal win
		else if (boardArray[0][0] == boardArray[1][1] && boardArray[1][1] == boardArray[2][2]) {
			if (boardArray[0][0] == "O" || boardArray[0][0] == "X") {
				System.out.println("Player " + boardArray[0][0] + " wins!");
				winner = true;
			}
		}else if (boardArray[2][0] == boardArray[1][1] && boardArray[0][2] == boardArray[0][2]) {
			if (boardArray[2][0] == "O" || boardArray[2][0] == "X") {
				System.out.println("Player " + boardArray[2][0] + " wins!");
				winner = true;
			}
		} else {
			winner = false;
		}
		
	}
	
	public static String whichPlayer() {
		if (player == "X") {
			player = "O";
			return "O";
		}
		player = "X";
		return "X";
	}
	
	public static void checkIfValidRow(int row) {
		
		if (row != 0 && row != 1 && row != 2) { //rowNum != 1 || rowNum != 2)
			System.out.println("Sorry that is not a valid row. Please try again.");
			askForMove();
		}
	}
	public static void checkIfValidCol(int col) {
		if (col != 0 && col != 1 && col != 2) {
			System.out.println("Sorry that is not a valid column. Please try again");
			askForMove();
		}
	}
	
	public static void checkIfTie(){
		if (winner == false) {
			System.out.println("Game is a tie");
		}
	}


}
