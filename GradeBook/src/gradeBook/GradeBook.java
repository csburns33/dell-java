/**
 * 
 */
package gradeBook;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Catherine_Burns
 *
 */
public class GradeBook {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many students in the gradebook?");
	    int numStudents  = Integer.parseInt(sc.nextLine());
	    Map<String,String> gradeBookMap = createGradeBook(numStudents);
	    Map<String,Double> avgGradeMap = createAverageGradeBook(gradeBookMap);
	    printGradeBook(avgGradeMap);
	}

	//creates the gradebook of all the grades in string format
	public static Map<String,String> createGradeBook(int numStudents) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String grades = "";
		Map<String, String> gradeBookMap = new HashMap<String, String>();
		for (int i=1;i<numStudents+1;i++) {
			System.out.println("What is student #"+ i +"'s name?");
			name = sc.nextLine();
			System.out.println("What are their grades, seperated by commas");
			grades = sc.nextLine();
			gradeBookMap.put(name, grades);		
		}
		return gradeBookMap;
	}
	
	//creates the gradebook with grade averages in string,double format
	public static Map<String,Double> createAverageGradeBook(Map<String,String> gradeBookMap) {
		ArrayList<String> names = new ArrayList<String>(gradeBookMap.keySet());
		Map<String,Double> avgGradeMap = new HashMap<String,Double>();
		for (int i=0; i<names.size(); i++) {
			String currentName = names.get(i);
			String currentGrades = gradeBookMap.get(currentName);
			String[] currentGradesArray = currentGrades.split(",");
			double currentAvgGrade = getAverageGrade(currentGradesArray);
			avgGradeMap.put(currentName, currentAvgGrade);	
		}
		return avgGradeMap;
	}
	
	//gets the average grade for each person in the gradebook
	public static double getAverageGrade (String[] currentGradesArray) {
		double totalGrade = 0;
		for (int i=0;i<currentGradesArray.length;i++) {
			totalGrade = totalGrade + Double.parseDouble(currentGradesArray[i]);
		}
		double avgGrade = (totalGrade/currentGradesArray.length);
		
		return avgGrade;
	}
	
	//prints names and their average grades
	public static void printGradeBook(Map<String,Double> avgGradeMap) {
		avgGradeMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}
