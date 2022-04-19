package User;

import customer.Cuisine;
import java.time.*;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class UserPreferences {
	
// properties
private LocalDateTime userRequestDateTime;
private String userPeriodSpentPreference;
private List<Cuisine> userCuisinePreferences;

// constructor
public UserPreferences(LocalDateTime userRequestDateTime, String userPeriodSpentPreference, List<Cuisine> userCuisinePreferences) {
	this.userRequestDateTime = userRequestDateTime;
	this.userPeriodSpentPreference = userPeriodSpentPreference;
	this.userCuisinePreferences = new ArrayList<Cuisine>();
}

// Add Cuisines to the list
public void addCuisineToPreferences(Cuisine cuisine) {
	userCuisinePreferences.add(cuisine);
}

}
