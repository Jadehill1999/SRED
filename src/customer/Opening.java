package customer;

import java.time.*;

public class Opening {

// properties
private String day;
private LocalTime open;
private LocalTime close;

// constructor

public Opening (String day, LocalTime open, LocalTime close) {
	this.day = day;
	this.open = open;
	this.close = close;

	}

public void addDayOpen(String customerDayOpen) {
	this.day = customerDayOpen;
}
public String getDay() {
	return day;
}

public void addOpeningTime(LocalTime customerOpeningTime) {
	this.open = customerOpeningTime;
}
public LocalTime getOpeningTime() {
	return open;
}

public void addCloseTime(LocalTime customerCloseTime) {
	this.close = customerCloseTime;
}
public LocalTime getCloseTime() {
	return close;
}

};
