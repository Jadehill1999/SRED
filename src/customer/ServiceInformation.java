package customer;

public class ServiceInformation {

// properties
	
private int periodSpent;
private Cuisine cuisine;

// constructor

public ServiceInformation(int periodSpent, Cuisine cuisine) {
	this.periodSpent = periodSpent;
	this.cuisine = cuisine;

	}

// Add cuisine
public void setCuisine(Cuisine cuisine) {
	this.cuisine = cuisine;
}


public Cuisine getCuisine() {
	return cuisine;
}

// Add period spent
public void addPeriodSpent(int customerPeriodSpent) {
	this.periodSpent = customerPeriodSpent; 
}
public int getPeriodSpent() {
	return periodSpent;
}


};
