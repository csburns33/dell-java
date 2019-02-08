package rentable;

public class Room implements Rentable{
	
	
	public Double dailyRate;
	public String name;
	
	//room constructor
	public Room(String roomName, Double dailyRate) {
		this.name = roomName;
		this.dailyRate = dailyRate;
	}
	
	//getter for name
	public String getDescription() {
		return name;
	}
	
	//returns rate for renting a room for one day
	public Double getDailyRate() {
		return dailyRate;
	}
	
	//returns rate for renting a room for x number of days
	public Double getPrice(Double days) {
		return dailyRate * days;
	}

}
