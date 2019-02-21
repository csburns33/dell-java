package wordGyess;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {

	public static void main(String[] args) {
		boolean guessedWord = false;
		String word = pickRandomWord();
		char[] wordArray = createArrayofWord(word);
		char[] characters = wordWithBlanks(word);
		while (guessedWord != true) {
			char letter = askForLetter();
			char[] newCharacters = updateCharacters(letter, word, characters);
			guessedWord = checkIfEqual(characters, wordArray);
		}
	}
	
	//creates an array of the characters in the word
	private static char[] createArrayofWord(String word) {
		char[] wordArray = new char[word.length()];
		for (int i = 0; i<word.length(); i++) {
			wordArray[i] = word.charAt(i);
		}
		return wordArray;
	}

	//checks if the user has correctly guessed the game
	private static boolean checkIfEqual(char[] characters, char[] word) {
		boolean win = Arrays.equals(characters, word);
		if (win== true) {
			System.out.println("congrats! you won!");
		}
		return(win);
	}

	//prints updated board
	private static void printChars(char[] characters) {
		System.out.println(String.valueOf(characters));	
	}

	//checks character array for guessed letter and updates it adequately
	private static char[] updateCharacters(char letter, String word, char[] characters) {
		int strt = 0;
		for (int i=0; i<word.length(); i++) {
			if(letter == word.charAt(i)) {
				int index = word.indexOf(letter,strt);
				characters[index] = letter;
				strt = index+1;
			}
		}
		printChars(characters);
		return characters;
	}

	//prompts user for a letter and returns that character
	private static char askForLetter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What letter do you guess?");
	    String letter  = sc.nextLine();
	    return letter.charAt(0);
		
	}

	//Prints the initial board game for the user
	private static char[] wordWithBlanks(String word) {
		char[] blankString = new char[word.length()];
		for (int i = 0; i<word.length(); i++) {
			blankString[i] = '-';
		}
		System.out.println(blankString);
		return blankString;
	}

	//picks a random word from the txt file
	public static String pickRandomWord() {
		Random rand = new Random();
		int index = 0;
		String[] wordArray= null;
		try { 
			
			BufferedReader reader = new BufferedReader(new FileReader("words_alpha.txt"));
			int wordCount = 0;
			String currentLine; 
			while((currentLine = reader.readLine()) != null){
				wordCount++;
			}
			wordArray = new String[wordCount];
			int counter = 0;
			String word;
			BufferedReader myReader = new BufferedReader(new FileReader("words_alpha.txt"));
			while((word = myReader.readLine()) != null){
				wordArray[counter] = word;
				counter++;
			}
			index = rand.nextInt(wordCount);
		}
		catch (Exception ex){
			System.out.println("Exception thrown: " + ex);
		}
		finally {
			String word = wordArray[index];
			return word;
		}
	}
	
	

}
