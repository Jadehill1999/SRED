package preferenceMatch;

import java.util.ArrayList;

import eatery.EateryInformation;
import user.UserPreferences;

public class RecommendedEateries {

	// treats each of our matching classes as a criterium, using the interface methods (polymorphism) to create a list of criteria
	private ArrayList<Matchable> criteria = new ArrayList<Matchable>();
	private ArrayList<EateryInformation> recommendedEateries = new ArrayList<EateryInformation>();
	
	// Pass in eateries, iterate through each and run the eligibility method below on each
	public ArrayList<EateryInformation> recommendedEateries(ArrayList<EateryInformation> dbEateryInformation, UserPreferences userPreferences){
		
		for (EateryInformation dbEatery: dbEateryInformation) {
			eligibleEateries(dbEatery, userPreferences);	
		}
		return recommendedEateries;
	}
	
	// checks if eatery passes each of the matching classes (criteria).  If all true the eatery is added to the recommended eateries list.
	public void eligibleEateries(EateryInformation eateryInformation, UserPreferences userPreferences){
			
		boolean passesPreferences = true;

		for(Matchable criterium: criteria){	
			if (!criterium.preferenceMatch(eateryInformation, userPreferences)) {
				passesPreferences = false;}
		}
		
		if (passesPreferences)
			recommendedEateries.add(eateryInformation);
	}
}
