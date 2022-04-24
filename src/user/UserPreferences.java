package user;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import eatery.Cuisine;

public class UserPreferences {
	
// properties
private LocalDateTime userRequestDateTime;
private String userPeriodSpentPreference;
private List<Cuisine> userCuisinePreferences;
private String userPostCode;
private int numberDiners;

// constructor
public UserPreferences(LocalDateTime userRequestDateTime, String userPeriodSpentPreference, List<Cuisine> userCuisinePreferences, String userPostCode, int numberDiners) {
	this.userRequestDateTime = userRequestDateTime;
	this.userPeriodSpentPreference = userPeriodSpentPreference;
	this.userCuisinePreferences = new ArrayList<Cuisine>();
	this.userPostCode = userPostCode;
	this.numberDiners = numberDiners;
}

// Add Cuisines to the list
public void addCuisineToPreferences(Cuisine cuisine) {
	userCuisinePreferences.add(cuisine);
}

public LocalDateTime getUserRequestDateTime() {
	return userRequestDateTime;
}

public String getUserPeriodSpentPreference() {
	return userPeriodSpentPreference;
}

public List<Cuisine> getUserCuisinePreferences(){
	return userCuisinePreferences;
}

public String getUserPostCode() {
	return userPostCode;
}

public int getNumberDiners() {
	return numberDiners;
}

}
