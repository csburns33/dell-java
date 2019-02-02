package parkingGarage;

public class Car {

	//Member  variables
	String Color;
	public String LicenseNo;
	public String Make;
	public String Model;
	
	//Class constructor
	public Car(String myColor, String myLicense, String myMake, String myModel) {
		Color = myColor;
		LicenseNo = myLicense;
		Make = myMake;
		Model = myModel;
	}
	
	//Getters and Setters
	public String getColor() {
		return Color;
	}
	
	public void setColor(String color) {
		this.Color = color;
	}
	
	public String getLicenseNo() {
		return LicenseNo;
	}
	public void setLicenseNo(String LicenseNo) {
		this.LicenseNo = LicenseNo;
	}
	
	public String getMake() {
		return Make;
	}
	
	public void setMake(String Make) {
		this.Make = Make;
	}
	
	public String getModel() {
		return Model;
	}
	
	public void setModel(String Model) {
		this.Model = Model;
	}
}

