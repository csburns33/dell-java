package rentable;

public interface Rentable {

	//Sets up Rentable interface with methods each implementation should include 
	String getDescription();
	Double getDailyRate();
	Double getPrice(Double days);
}
