package preferenceMatch;

import java.util.List;

import User.UserPreferences;
import customer.Cuisine;
import customer.EateryInformation;

public class ServiceInformationMatch implements PreferenceMatch{
	
	// Service period requirements
	// Period Spent time sorted into categories to match end user preferences;
	// Quick bite <= 45, No preference all, Leisurely >= 90

	@Override
	public Boolean preferenceMatch(EateryInformation eateryInfo, UserPreferences userPreferences) {
		int servicePeriodSpent = eateryInfo.getServiceInformation().getPeriodSpent();
		int currentWaitTime = eateryInfo.getLiveQueue().getCurrentWaitTime();
		String userPeriodSpent = userPreferences.getUserPeriodSpentPreference();
		
		Cuisine serviceCuisine = eateryInfo.getServiceInformation().getCuisine();
		List<Cuisine> userCuisinePreference = userPreferences.getUserCuisinePreferences();
		
		if(matchServiceSpeed(servicePeriodSpent, currentWaitTime, userPeriodSpent) && matchCuisinePreference(serviceCuisine, userCuisinePreference))
			return true;
		return false;
	}
	
	public Boolean matchServiceSpeed(int servicePeriodSpent, int currentWaitTime, String userPeriodSpent) {		
		
		if (userPeriodSpent.isEmpty())
			return true;
		else if(userPeriodSpent == "Quick bite" && (servicePeriodSpent + currentWaitTime) <= 45)
			return true;
		else if(userPeriodSpent == "Leisurely" && (servicePeriodSpent + currentWaitTime) >= 90)
			return true;
		else 
			return false;
	}
	
	public Boolean matchCuisinePreference(Cuisine serviceCuisine, List<Cuisine> userCuisinePreference) {
		Boolean matching = false;
	
		for(Cuisine cuisine : userCuisinePreference) {
			if (cuisine == serviceCuisine) 
			{
			matching = true;
			}
		}
		
		return matching;
	}

}
