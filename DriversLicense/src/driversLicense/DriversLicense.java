package driversLicense;

import java.time.LocalDate;
import java.time.Period;


public class DriversLicense {

	private String FirstName;
	private String LastName;
	private String DOB;
	private String Height;
	private String Gender;
	
	//accessing first name private attribute
	public String getFirstName() {
		return FirstName;
	}
	//setting this object's first name attribute
	public void setFirstName(String myFirstName) {
		FirstName = myFirstName;
	}
	//accessing last name private attribute
	public String getLastName() {
		return LastName;
	}
	//setting this object's last name attribute
	public void setLastName(String myLastName) {
		FirstName = myLastName;
	}
	//accessing dob private attribute
	public String getDOB() {
		return DOB;
	}
	//setting this object's DOB attribute
	public void setDOB(String myDOB) {
		FirstName = myDOB;
	}
	
	//accessing height private attribute
	public String getHeight() {
		return Height;
	}
	//setting this object's height attribute
	public void setHeight(String myHeight) {
		Height = myHeight;
	}
	//accessing gender private attribute
	public String getGender() {
		return Gender;
	}
	//setting this object's gender attribute
	public void setGender(String myGender) {
		Gender = myGender;
	}	
	//inputs string first and last name and
	//returns concatenated string of full name
	public String getFullName(String FirstName, String LastName) {
		return FirstName + " " + LastName;
	}
	
//	public void setFullName(String myFullName) {
//		FullName = myFullName;
//	}
	
	//inputs string date of birth in format year,month, day and 
	//returns the person's age
	public int getAge(String DOB) {
		LocalDate today = LocalDate.now();
		String[] dobList = DOB.split(",");
		int year = Integer.parseInt(dobList[0]);
		int month = Integer.parseInt(dobList[1]);
		int day = Integer.parseInt(dobList[2]);
		
		LocalDate birthday = LocalDate.of(year,month,day);
		
		Period period = Period.between(birthday, today);
		
		int age = period.getYears();		
		return age;
	}
	
	//Constructor for drivers license class
	public DriversLicense(String myFirstName, String myLastName, String myDOB, String myHeight,String myGender) {
		FirstName = myFirstName;
		LastName = myLastName;
		DOB = myDOB;
		Height = myHeight;
		Gender = myGender;	
	}
	
}
