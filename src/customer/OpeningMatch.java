package customer;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;
import User.UserBuilder;
import User.UserPreferences;

public class OpeningMatch implements UserPeriodPrefInMinutes {
	
	
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
		
		// Boolean to match time (isOpen)
		public Boolean isOpen(LocalDateTime userRequestDateTime, String userPeriodSpentPreference, int currentWaitTime, LocalTime serviceOpen, LocalTime serviceClose) {
			
			LocalTime requestTime = userRequestDateTime.toLocalTime();
			int userStay = userPeriodPrefInMinutes(userPeriodSpentPreference);
			LocalTime maxFinishTime = requestTime.plusMinutes(userStay + currentWaitTime);
			
			if ((requestTime.isAfter(serviceOpen) || requestTime.compareTo(serviceOpen) == 0) && (maxFinishTime.isBefore(serviceClose) || maxFinishTime.compareTo(serviceClose) == 0))
				return true;
			else 
				return false;
		}
}
