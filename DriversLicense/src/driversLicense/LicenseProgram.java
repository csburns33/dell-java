package driversLicense;

public class LicenseProgram {

	public static void main(String[] args) {
		//Instatiate first license for catherine
		DriversLicense firstLicense = new DriversLicense("Catherine", "Burns", "1995,01,22", "5' 3'", "Female" );
		System.out.println(firstLicense.getFullName("Catherine", "Burns"));
		System.out.println(firstLicense.getAge("1995,01,22"));
		//Instatiate first license for derek
		DriversLicense secondLicense = new DriversLicense("Derek", "Nalodka", "1993,10,23", "6' 0'", "Male");
		System.out.println(secondLicense.getFullName("Derek", "Nalodka"));
		System.out.println(secondLicense.getAge( "1993,10,23"));
		
		//Instatiate first license for britney
		DriversLicense thirdLicense = new DriversLicense("Britney", "Spears", "1988, 8,23","5' 5'", "Female" );
		System.out.println(thirdLicense.getFullName("Britney", "Spears"));
		System.out.println(thirdLicense.getAge("1988,8,23"));
		
	}
}
