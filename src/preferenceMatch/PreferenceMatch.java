package preferenceMatch;
import eatery.EateryInformation;
import user.UserPreferences;

public interface PreferenceMatch {
	public Boolean preferenceMatch(EateryInformation eateryInfo, UserPreferences userPreferences);
}
