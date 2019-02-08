package rentable;

public class Condo implements Rentable {
	
	public Double weeklyRate;
	public String name;
	
	//condo constructor
	public Condo(String condoName, Double weeklyRate) {
		this.name = condoName;
		this.weeklyRate = weeklyRate;
	}
	
	//getter for name
	public String getDescription() {
		return name;
	}
	
	//returns rate of renting a condo for a day
	public Double getDailyRate() {
		return weeklyRate / 7;
	}
	
	//return rate of renting a condo for x number of days
	public Double getPrice(Double days) {
		return weeklyRate * days / 7;
	}
	
	
}
