package customer;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;


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
	
	
	// Time parser to convert end user LocalDateTime into time for comparison with Opening class
//	public LocalTime requestTime(LocalDateTime userRequestDateTime) {
//		return userRequestDateTime.toLocalTime();
//	}
	
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
	public Boolean isOpen(LocalDateTime userRequestDateTime, int userPeriodSpentPreference, int currentWaitTime, LocalTime serviceOpen, LocalTime serviceClose) {
		LocalTime requestTime = userRequestDateTime.toLocalTime();
		LocalTime averageFinishTime = requestTime.plusMinutes(userPeriodSpentPreference + currentWaitTime);
		
		if ((requestTime.isAfter(serviceOpen) || requestTime.compareTo(serviceOpen) == 0) && (averageFinishTime.isBefore(serviceClose) || averageFinishTime.compareTo(serviceClose) == 0))
			return true;
		else 
			return false;
	}
	
	// Service period requirements
	// Period Spent time sorted into categories to match end user preferences;
	// Quick bite <= 45, Average >45 <89, Leisurely >= 90
	// nullable?
	// Cuisine == customer preference(s) perhaps give end user option to choose more than one and pass in a list
	// iterate through end user list and match against customer cuisine
	// nullable?
	
	// Location requirements
	// Have a postcode letter list - assign a value and bubble sort?
	// for this project use postcode numbers as ranks of closeness.
	// apply list of matching customers (from above), iterate through and sort according to the postcode closeness.
	// save and deliver the new list with customers in the correct order for the end user.  Must include cuisine information and time category
	// limit the maximum number of results in order to reduce end user choice when no parameters are entered.

	
	
	
	
	
	
}

