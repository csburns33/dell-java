package helloworld;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your 1st number?");
	    String num1 = sc.nextLine();
	    System.out.println("What is your 2nd number?");
	    String num2 = sc.nextLine();
		System.out.println(addition(num1,num2));
		System.out.println(subtraction(num1,num2));
		System.out.println(multiplication(num1,num2));
		System.out.println(division(num1,num2));
		System.out.println(modulus(num1,num2))
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
