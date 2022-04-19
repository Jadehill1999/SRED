package customer;

import java.time.*;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;
import User.UserPreferences;


public class Search {
	
	// Create a new list variable for the search 

	List<EateryInformation> searchResults;

	
	// Opening requirements
		// Day parser to convert end user LocalDateTime into day int (Opening class)
	
	public String requestDay(LocalDateTime userRequestDateTime) {
		String dayOfWeek = null;
		
		LocalDate requestDate = userRequestDateTime.toLocalDate();
		DayOfWeek dayOfWeekEnum = requestDate.getDayOfWeek();
		dayOfWeek = dayOfWeekEnum.getDisplayName(TextStyle.FULL, Locale.ENGLISH); 
		
		return dayOfWeek;
	}
	
	// Boolean to match day
	public boolean matchOpeningDay(LocalDateTime userRequestDateTime, String customerOpeningDay) {
		
		if (requestDay(userRequestDateTime) == customerOpeningDay)
			return true;
		else
			return false;
	}
	
	// Period Spent time sorted into categories to match end user preferences;
	// Quick bite <= 45, No Preference 45-89, Leisurely >= 90
	// Get minutes of the user preference
	public int userPeriodSpentPreferenceMinutes(String userPeriodSpentPreference) {
		int periodSpentPreference = 0;
		
		if(userPeriodSpentPreference.isEmpty())
			periodSpentPreference = 60;
		else {
			switch(userPeriodSpentPreference) {
			case "Quick bite":
				periodSpentPreference = 45;
				break;
			case "Leisurely":
				periodSpentPreference = 90;
			}
		}
		return periodSpentPreference;
	}
	
	// Boolean to match time (isOpen)
	public Boolean isOpen(LocalDateTime userRequestDateTime, String userPeriodSpentPreference, int currentWaitTime, LocalTime serviceOpen, LocalTime serviceClose) {
		
		LocalTime requestTime = userRequestDateTime.toLocalTime();
		int userStay = userPeriodSpentPreferenceMinutes(userPeriodSpentPreference);
		LocalTime maxFinishTime = requestTime.plusMinutes(userStay + currentWaitTime);
		
		if ((requestTime.isAfter(serviceOpen) || requestTime.compareTo(serviceOpen) == 0) && (maxFinishTime.isBefore(serviceClose) || maxFinishTime.compareTo(serviceClose) == 0))
			return true;
		else 
			return false;
	}
	
	// Service period requirements
	// Period Spent time sorted into categories to match end user preferences;
	// Quick bite <= 45, No preference all, Leisurely >= 90
	

	public Boolean matchUserSpeedPreference(String userPeriodSpentPreference, int currentWaitTime, int customerPeriodSpent) {
		if (!userPeriodSpentPreference.isEmpty())
			return true;
		else if(userPeriodSpentPreference == "Quick bite" && (customerPeriodSpent + currentWaitTime) <= 45)
			return true;
		else if(userPeriodSpentPreference == "Leisurely" && (customerPeriodSpent + currentWaitTime) >= 90)
			return true;
		else 
			return false;
	}
	
	
	// Cuisine == customer preference(s) perhaps give end user option to choose more than one and pass in a list
	// iterate through end user list and match against customer cuisine
	// nullable?
	
	public Boolean matchCuisinePreference(Cuisine serviceCuisine, Cuisine[] userCuisinePreference) {
		Boolean matching = false;
	
		for(Cuisine cuisine : userCuisinePreference) {
			if (cuisine == serviceCuisine) 
			{
			matching = true;
			}
		}
		
		return matching;
	}
	
	// construct the list of matching eateries
	
	public void eateryMatch(EateryInformation customerEateryInfo, UserPreferences userPreferences) {
		if(matchOpeningDay(userPreferences.getUserRequestDateTime(), customerEateryInfo.getOpening().getDay()) == true) {
			searchResults.add(customerEateryInfo);
			}
	}
	
	// Location requirements
	// Have a postcode letter list - assign a value and bubble sort?
	// for this project use postcode numbers as ranks of closeness.
	// apply list of matching customers (from above), iterate through and sort according to the postcode closeness.
	// save and deliver the new list with customers in the correct order for the end user.  Must include cuisine information and time category
	// limit the maximum number of results in order to reduce end user choice when no parameters are entered.

	
	
	
	
	
	
}

