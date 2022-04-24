package preferenceMatch;

import eatery.EateryInformation;
import user.UserPreferences;


public class EateryInformationMatch implements Matchable{
	
	// calculates number of dining spots available
	public int eaterySpace(EateryInformation eateryInfo) {
		
		int eaterySpace = eateryInfo.getCapacity()-eateryInfo.getCheckedIn();
		
		return eaterySpace;
	}
	
	// matches the number of diners the user is looking for with available dining spots at the eatery
	@Override
	public Boolean preferenceMatch(EateryInformation eateryInfo, UserPreferences userPreferences) {
		
		int eaterySpace = eaterySpace(eateryInfo);
		int userNumberRequest = userPreferences.getNumberDiners();
		
		if (eaterySpace > userNumberRequest)
			return true;
		else
			return false;
	}	
}

