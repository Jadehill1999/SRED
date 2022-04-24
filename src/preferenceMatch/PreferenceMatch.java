package preferenceMatch;
import User.UserPreferences;
import customer.EateryInformation;

public interface PreferenceMatch {
	public Boolean preferenceMatch(EateryInformation eateryInfo, UserPreferences userPreferences);
}
