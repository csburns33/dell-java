package ticTacToe;

import java.util.Scanner;

public class Statistics {
	
	public static Double sum = 0.0;
	public static Double count = 0.0;

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give me a list of numbers separated by commas");
	    String stringNumbers  = sc.nextLine();
	    System.out.println(stringNumbers);
	    calcSumAndCountList(stringNumbers);
	    Double min = findMin(stringNumbers);
	    Double max = findMax(stringNumbers);
	    Double avg = findAvg(stringNumbers);
	    System.out.println("The min is: " + min);
	    System.out.println("The max is: " + max);
	    System.out.println("The number of elements is: " + count);
	    System.out.println("The average is: " + avg);
	    System.out.println("The sum is: " + sum);
   
	}
	
	public static void calcSumAndCountList(String stringNumbers) {
		String[] stringListNumbers = stringNumbers.split(",");
		for (String a:stringListNumbers) {
			Double num = Double.parseDouble(a);
			sum = sum+num;
			count++;
		}
		System.out.println("sum: " + sum);
		System.out.println("count: " + count);
	}
	
	public static double findMin(String stringNumbers) {
		double min = Double.parseDouble(stringNumbers.split(",")[0]);
		String[] stringListNumbers = stringNumbers.split(",");
		for (String a:stringListNumbers) {
			Double num = Double.parseDouble(a);	
			if (num<min) {
				min = num;
			}
		}
		return min;
		
	}
	public static double findMax(String stringNumbers) {
		double max = Double.parseDouble(stringNumbers.split(",")[0]);
		String[] stringListNumbers = stringNumbers.split(",");
		for (String a:stringListNumbers) {
			Double num = Double.parseDouble(a);	
			if (num>max) {
				max = num;
			}
		}
		return max;
		
	}
	public static double findAvg(String stringNumbers) {
		double avg = sum/count;
		return avg;
		
	}
	
}
