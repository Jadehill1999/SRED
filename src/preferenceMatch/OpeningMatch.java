package preferenceMatch;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

import User.UserPeriodPrefInMinutes;
import User.UserPreferences;

public class OpeningMatch implements UserPeriodPrefInMinutes, PreferenceMatch {
	
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
	public Boolean matchOpeningDay(LocalDateTime userRequestDateTime, String customerOpeningDay) {
		
		if (requestDay(userRequestDateTime) == customerOpeningDay)
			return true;
		else
			return false;
	}
		
		// Period Spent time sorted into categories to match end user preferences;
		// Quick bite <= 45, No Preference 45-89, Leisurely >= 90
		// Get minutes of the user preference
	public int userPeriodPrefInMinutes(String userPeriodSpentPreference) {
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

	@Override
	public Boolean preferenceMatch(EateryInformation eateryInfo, UserPreferences userPreferences) {
		
		LocalTime requestTime = userPreferences.getUserRequestDateTime().toLocalTime();
		LocalTime openTime = eateryInfo.getOpening().getOpeningTime();
		LocalTime closeTime = eateryInfo.getOpening().getCloseTime();
		
		int userStay = userPeriodPrefInMinutes(userPreferences.getUserPeriodSpentPreference());
		LocalTime maxFinishTime = requestTime.plusMinutes(userStay + eateryInfo.getLiveQueue().getCurrentWaitTime());
		String temp = eateryInfo.getOpening().getDay();
		LocalDateTime userRequestDateTime = userPreferences.getUserRequestDateTime();
		Boolean openThatDay = matchOpeningDay(userPreferences.getUserRequestDateTime(), temp);
		
		if ((requestTime.isAfter(openTime) || requestTime.compareTo(openTime) == 0) && (maxFinishTime.isBefore(closeTime) || maxFinishTime.compareTo(closeTime) == 0) && openThatDay == true)
			{return true;}
		else {return false;}
	}
}
