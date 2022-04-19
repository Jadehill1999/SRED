package User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import customer.Cuisine;

public class UserBuilder {
	
	private LocalDateTime userRequestDateTime;
	private String userPeriodSpentPreference;
	private List<Cuisine> userCuisinePreferences;
	private String userPostCode;

	
	public UserBuilder (LocalDateTime userRequestDateTime, String userPeriodSpentPreference, List<Cuisine> userCuisinePreferences, String userPostCode) {
		this.userRequestDateTime = LocalDateTime.now();
		this.userPeriodSpentPreference = userPeriodSpentPreference;
		this.userCuisinePreferences = new ArrayList<Cuisine>();
		this.userPostCode = userPostCode;
	}
	
	public UserBuilder setUserRequestDateTime(LocalDateTime userRequestDateTime) {
		this.userRequestDateTime = userRequestDateTime;
		return this;
	}
	
	public UserBuilder setUserPeriodSpentPreferences(String userPeriodSpentPreference) {
		this.userPeriodSpentPreference = userPeriodSpentPreference;
		return this;
	}
	
	public UserBuilder setUserCuisinePreferences(List<Cuisine> userCuisinePreferences) {
		this.userCuisinePreferences = userCuisinePreferences;
		return this;
	}
	
	public UserBuilder setUserPostCode(String userPostCode) {
		this.userPostCode = userPostCode;
		return this;
	}
	public UserPreferences build () {
		return new UserPreferences(userRequestDateTime, userPeriodSpentPreference, userCuisinePreferences, userPostCode);
	}
}
