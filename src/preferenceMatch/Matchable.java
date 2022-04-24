package preferenceMatch;
import eatery.EateryInformation;
import user.UserPreferences;

public interface Matchable {
	public Boolean preferenceMatch(EateryInformation eateryInfo, UserPreferences userPreferences);
}
