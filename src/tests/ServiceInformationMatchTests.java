package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import eatery.Cuisine;
import eatery.EateryInformation;
import preferenceMatch.ServiceInformationMatch;
import user.UserPreferences;

class ServiceInformationMatchTests {
	

	private ServiceInformationMatch s = new ServiceInformationMatch();
	private EateryInformation eatery1;
	private ArrayList<EateryInformation> dbEateries;
	private AddedEateries addedEateries = new AddedEateries();

	@BeforeEach
	void before() {
	
	addedEateries.addInformation();
	dbEateries = addedEateries.getEateries();
	eatery1 = dbEateries.get(0);
	
	}

	@Test
	void testPreferenceMatch() {
	// Arrange 
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022, 04 ,19 , 21, 00, 00, 00000), "Quick bite", new ArrayList<Cuisine>(Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER)), "ML3 0AA", 2);
	// Action
		boolean servicePreferenceMatch = s.preferenceMatch(eatery1, userPref1);
	// Assert
		assertEquals(true, servicePreferenceMatch);
	}

	@Test
	void testMatchServiceSpeed() {
		// Arrange 
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022, 04 ,19 , 21, 00, 00, 00000), "Quick bite", new ArrayList<Cuisine>(Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER)), "ML3 0AA", 2);
	// Action
		boolean serviceSpeedMatch = s.preferenceMatch(eatery1, userPref1);
	// Assert
		assertEquals(true, serviceSpeedMatch);
	}

	@Test
	void testMatchCuisinePreference() {
		// Arrange 
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022, 04 ,19 , 21, 00, 00, 00000), "Quick bite", new ArrayList<Cuisine>(Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER)), "ML3 0AA", 2);
	// Action
		boolean cuisinePreferenceMatch = s.preferenceMatch(eatery1, userPref1);
	// Assert
		assertEquals(true, cuisinePreferenceMatch);
	}

}