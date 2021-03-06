package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import preferenceMatch.EateryInformationMatch;
import preferenceMatch.OpeningMatch;
import preferenceMatch.RecommendedEateries;
import preferenceMatch.ServiceInformationMatch;
import user.UserPreferences;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import eatery.Cuisine;
import eatery.EateryInformation;

class IntegrationTests {
	
	private RecommendedEateries r;
	private EateryInformationMatch e;
	private OpeningMatch o;
	private ServiceInformationMatch s;
	private ArrayList<EateryInformation> dbEateries;
	private AddedEateries addedEateries = new AddedEateries();
	

	@BeforeEach
	public void before(){
		
	r = new RecommendedEateries();
	e = new EateryInformationMatch();
	o = new OpeningMatch();
	s = new ServiceInformationMatch();
	addedEateries.addInformation();
	dbEateries = addedEateries.getEateries();
	
	}
	
	@Test
	void eateryInfoPreferenceMatchTest() {
	// Arrange
		EateryInformation eatery1 = dbEateries.get(0);
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022, 04 ,19 , 21, 00, 00, 00000), "Quick bite", new ArrayList<Cuisine>(Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER)), "ML3 0AA", 2);
	// Action
		boolean eateryPreferenceMatch = e.preferenceMatch(eatery1, userPref1);
	// Assert
		assertEquals(true, eateryPreferenceMatch);
	}
	
	@Test
	void openingPreferenceMatchTest() {
	// Arrange
		EateryInformation eatery1 = dbEateries.get(0);
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022, 04 ,19 , 21, 00, 00, 00000), "Quick bite", new ArrayList<Cuisine>(Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER)), "ML3 0AA", 2);	
	// Action
		Boolean openPreferenceMatch = o.preferenceMatch(eatery1, userPref1);
	//Assert
		assertEquals(true, openPreferenceMatch)		
			;
	}
	
	@Test
	void serviceInfoPreferenceMatchTest() {
	// Arrange 
		EateryInformation eatery1 = dbEateries.get(0);
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022, 04 ,19 , 21, 00, 00, 00000), "Quick bite", new ArrayList<Cuisine>(Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER)), "ML3 0AA", 2);
	// Action
		boolean servicePreferenceMatch = s.preferenceMatch(eatery1, userPref1);
	// Assert
		assertEquals(true, servicePreferenceMatch);
	}
	
	@Test
	void testRecommendedEateriesHappyPath() {
	
	// Arrange
		UserPreferences userPref1 = new UserPreferences(LocalDateTime.of(2022,04,22, 21, 00, 00, 00000), "Quick Bite", new ArrayList<Cuisine>(Arrays.asList(Cuisine.FASTFOOD, Cuisine.BURGER)), "ML3 0AA", 2);

	//Action
		ArrayList<EateryInformation> result = r.recommendedEateries(dbEateries, userPref1);
	
	//Assert
		assertEquals(2, result.size());
	}

}
