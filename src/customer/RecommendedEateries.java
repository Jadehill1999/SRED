package customer;

import java.util.ArrayList;

import User.UserPreferences;
import customer.PreferenceMatch;

public class RecommendedEateries {
	
	private ArrayList<PreferenceMatch> criteria;
	
	public ArrayList<EateryInformation> eateryInformation(EateryInformation eateryInformation, UserPreferences userPreferences){
		
		ArrayList<EateryInformation> recommendedEateries = new ArrayList<EateryInformation>();

		for(PreferenceMatch criterium: criteria){
			if (criterium.preferenceMatch(eateryInformation, userPreferences));
			recommendedEateries.add(eateryInformation);
		}
		return recommendedEateries;
	}
	
	// for each eateryInformation object in the test case seed, 
	// iterate through PreferenceMatch classes,
	// evaluate to true? = new list
	// return list
	// AssertEquals.recommendedEateries.length(3);
	// AssertEquals. recommendedEateries[0].name("McDonalds");

}
