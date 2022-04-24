package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import eatery.Cuisine;
import preferenceMatch.ServiceInformationMatch;
import user.UserPreferences;

class ServiceInformationMatchTests {
	

	private ServiceInformationMatch s = new ServiceInformationMatch();

	@Test
	void testMatchServiceSpeed() {
	// Arrange 
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022, 04 ,19 , 21, 00, 00, 00000), "Quick bite", new ArrayList<Cuisine>(Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER)), "ML3 0AA", 2);
	// Action
		Boolean result = s.matchServiceSpeed(30, 10, userPref1.getUserPeriodSpentPreference());
	// Assert
		assertEquals(true, result);
	}

	@Test
	void testMatchCuisinePreference() {
	// Arrange
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022, 04 ,19 , 21, 00, 00, 00000), "Quick bite", Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER), "ML3 0AA", 2);
	// Action
		Boolean result = s.matchCuisinePreference(Cuisine.BURGER, userPref1.getUserCuisinePreferences());
	// Assert
		assertEquals(true, result);
	}
}
