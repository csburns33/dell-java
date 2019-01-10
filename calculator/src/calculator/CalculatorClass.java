package calculator;
import java.util.Scanner;

public class CalculatorClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your 1st number?");
	    String num1 = sc.nextLine();
	    System.out.println("What is your 2nd number?");
	    String num2 = sc.nextLine();
		System.out.println("Added: " + addition(Double.parseDouble(num1),Double.parseDouble(num2)));
		System.out.println("Subtracted: " + subtraction(Double.parseDouble(num1),Double.parseDouble(num2)));
		System.out.println("Multiplied: " + multiplication(Double.parseDouble(num1),Double.parseDouble(num2)));
		System.out.println("Divided: " + division(Double.parseDouble(num1),Double.parseDouble(num2)));
		System.out.println("Modulus: " + modulus(Double.parseDouble(num1),Double.parseDouble(num2)));
	}
	public static double addition(double int1, double int2) {
		double myNum = int1 + int2;
		return(myNum);
	}
	public static double subtraction(double int1, double int2) {
		double myNum = int1 - int2;
		return(myNum);
	}
	public static double multiplication(double int1, double int2) {
		double myNum = int1*int2;
		return(myNum);
	}
	public static double division(double int1, double int2) {
		double myNum = int1/int2;
		return(myNum);
	}
	public static double modulus(double int1, double int2) {
		double myNum = int1%int2;
		return(myNum);
	}
}
