package user;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import eatery.Cuisine;

public class UserBuilder {
	
	private LocalDateTime userRequestDateTime;
	private String userPeriodSpentPreference;
	private List<Cuisine> userCuisinePreferences;
	private String userPostCode;
	private int numberDiners;

	
	public UserBuilder (LocalDateTime userRequestDateTime, String userPeriodSpentPreference, List<Cuisine> userCuisinePreferences, String userPostCode, int numberDiners) {
		this.userRequestDateTime = LocalDateTime.now();
		this.userPeriodSpentPreference = userPeriodSpentPreference;
		this.userCuisinePreferences = new ArrayList<Cuisine>();
		this.userPostCode = userPostCode;
		this.numberDiners = numberDiners;
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
	
	public UserBuilder setNumberDiners(int numberDiners) {
		this.numberDiners = numberDiners;
		return this;
	}
	
	// allows for varying number of properties to be included in the constructor of the user preferences class
	public UserPreferences build () {
		return new UserPreferences(userRequestDateTime, userPeriodSpentPreference, userCuisinePreferences, userPostCode, numberDiners);
	}
}
