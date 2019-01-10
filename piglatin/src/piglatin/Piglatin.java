package piglatin;

import java.util.Scanner;

public class Piglatin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your word?");
	    String myWord = sc.nextLine();
	    if (startsWithVowel(myWord)) {
	    	myWord = myWord + "yay";
	    } else {
	    	if (hasVowels(myWord)) {
	    		myWord = moveConsonants(myWord);
	    	} else {
	    		myWord = myWord + "ay";
	    	}
	    }
	    System.out.println(myWord);
	       
	}
	
	
	public static boolean startsWithVowel(String myWord) {
		char c= myWord.charAt(0);
		if (c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
			return true;
		}
		return false;
	}
	
	public static boolean hasVowels(String myWord) {
		if (myWord.contains("a") || myWord.contains("e") || myWord.contains("i") || myWord.contains("o") || myWord.contains("u")) {
			return true;
		}
		return false;
	}
	
	public static String moveConsonants(String myWord) {
		int myIndex = 10000;
		if (myWord.contains("a")) {
			myIndex = myWord.indexOf("a");
		}
		if (myWord.contains("e")) {
			if (myWord.indexOf("e")< myIndex) {
				myIndex = myWord.indexOf("e");
			}
		}
		if (myWord.contains("i")) {
			if (myWord.indexOf("i")< myIndex) {
				myIndex = myWord.indexOf("i");
			}
		}
		if (myWord.contains("o")) {
			if (myWord.indexOf("o")< myIndex) {
				myIndex = myWord.indexOf("o");
			}
		}
		if (myWord.contains("u")) {
			if (myWord.indexOf("u")< myIndex) {
				myIndex = myWord.indexOf("u");
			}
		}
		String newWord = myWord.substring(myIndex) + myWord.substring(0,myIndex) + "ay";
		return newWord;
	}
}
