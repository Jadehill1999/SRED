package customer;

import java.time.*;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import User.UserPreferences;
import customer.EateryInformation;


public class EateryMatch {
	
	// Create a new list variable for the search 

	List<EateryInformation> searchResults;
	
	// construct the list of matching eateries
	
	public void eateryMatch(EateryInformation customerEateryInfo, UserPreferences userPreferences) {

		LocalDateTime userRequestDateTime = userPreferences.getUserRequestDateTime();
		
		if(matchOpeningDay(userRequestDateTime, customerEateryInfo.getOpening().getDay()) == true
				&& isOpen(userRequestDateTime, userPreferences.getUserPeriodSpentPreference(), customerEateryInfo.getLiveQueue().getCurrentWaitTime(), customerEateryInfo.getOpening().getOpeningTime(), customerEateryInfo.getOpening().getCloseTime()) == true
				&& matchUserSpeedPreference(userPreferences.getUserPeriodSpentPreference(), customerEateryInfo.getLiveQueue().getCurrentWaitTime(), customerEateryInfo.getServiceInformation().getPeriodSpent()) == true
				&& matchCuisinePreference(customerEateryInfo.getServiceInformation().getCuisine(), userPreferences.getUserCuisinePreferences()) == true)
		{
			searchResults.add(customerEateryInfo);
		}
	}
	
	// Location requirements
	// Have a postcode letter list - assign a value and bubble sort?
	public void searchResultsSort(List<EateryInformation> searchResults) {
		
		List<String> postCodeOrderRef = new ArrayList<String>(){
			{
				add("AB");
				add("EH"); 
				add("DD");
				add("IV");
			}
		};
		
	}
	// for this project use postcode numbers as ranks of closeness.
	// apply list of matching customers (from above), iterate through and sort according to the postcode closeness.
	// save and deliver the new list with customers in the correct order for the end user.  Must include cuisine information and time category
	// limit the maximum number of results in order to reduce end user choice when no parameters are entered.

	
	
	
	
	
	
}

