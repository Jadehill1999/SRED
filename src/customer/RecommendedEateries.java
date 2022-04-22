package customer;

import java.util.ArrayList;

import User.UserPreferences;
import customer.PreferenceMatch;

public class RecommendedEateries {
	
	private ArrayList<PreferenceMatch> criteria = new ArrayList<PreferenceMatch>();
	private ArrayList<EateryInformation> recommendedEateries = new ArrayList<EateryInformation>();
	
	public ArrayList<EateryInformation> recommendedEateries(ArrayList<EateryInformation> dbEateryInformation, UserPreferences userPreferences){
		
		for (EateryInformation dbEatery: dbEateryInformation) {
			eligibleEateries(dbEatery, userPreferences);	
		}
		return recommendedEateries;
	}
	
	
	public void eligibleEateries(EateryInformation eateryInformation, UserPreferences userPreferences){
			
		boolean passesPreferences = true;

		for(PreferenceMatch criterium: criteria){	
			if (!criterium.preferenceMatch(eateryInformation, userPreferences)) {
				passesPreferences = false;}
		}
		
		if (passesPreferences)
			recommendedEateries.add(eateryInformation);
	}
}
