package preferenceMatch;

import java.time.*;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import eatery.EateryInformation;
import user.UserPreferences;


public class EateryInformationMatch implements PreferenceMatch{
	
	@Override
	public Boolean preferenceMatch(EateryInformation eateryInfo, UserPreferences userPreferences) {
		
		int eaterySpace = eateryInfo.getCapacity()-eateryInfo.getCheckedIn();
		int userNumberRequest = userPreferences.getNumberDiners();
		
		if (eaterySpace > userNumberRequest)
			return true;
		return false;
	}	
}

