package rentable;

public class Tool implements Rentable {


	public Double hourlyRate;
	public String name;
	
	//Tool constructor
	public Tool(String toolName, Double hourlyRate) {
		this.name = toolName;
		this.hourlyRate = hourlyRate;
	}
	
	//getter for name
	public String getDescription() {
		return name;
	}
	
	//returns rate of renting a tool for a whole day
	public Double getDailyRate() {
		return hourlyRate * 24;
	}
	
	//returns rate of renting a tool for x number of days
	public Double getPrice(Double days) {
		return hourlyRate * days * 24;
	}
	

	
	
}
