package customer;

public class Opening {

// properties
private String day;
private int open;
private int close;

// constructor

public Opening (String day, int open, int close) {
	this.day = day;
	this.open = open;
	this.close = close;

	}

public void addDayOpen(String customerDayOpen) {
	this.day = customerDayOpen;
}

public void addOpeningTime(int customerOpeningTime) {
	this.open = customerOpeningTime;
}

public void addCloseTime(int customerCloseTime) {
	this.close = customerCloseTime;
}

};
