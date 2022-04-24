package preferenceMatch;

import java.time.*;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import eatery.EateryInformation;
import user.UserPreferences;


public class EateryInformationMatch implements PreferenceMatch{
	
	public int eaterySpace(EateryInformation eateryInfo) {
		
		int eaterySpace = eateryInfo.getCapacity()-eateryInfo.getCheckedIn();
		
		return eaterySpace;
	}
	
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

