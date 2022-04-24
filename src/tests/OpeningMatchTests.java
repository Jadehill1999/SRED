package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import eatery.Cuisine;
import eatery.EateryInformation;
import preferenceMatch.OpeningMatch;
import user.UserPreferences;

class OpeningMatchTests {
	
	private OpeningMatch o = new OpeningMatch();
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
		Boolean openPreferenceMatch = o.preferenceMatch(eatery1, userPref1);
	//Assert
		assertEquals(true, openPreferenceMatch)		
			;
	}
	
	@Test
	void requestDayTest() {
	
		LocalDateTime userRequestDateTime = LocalDateTime.of(2022,04,19, 21, 00, 00, 00000);
		String result = o.requestDay(userRequestDateTime);
		
		assertEquals("Tuesday", result);
	}
	
	@Test
	void matchOpeningDayTest() {
		LocalDateTime userRequestDateTime = LocalDateTime.of(2022,04,19, 21, 00, 00, 00000);
		String customerOpeningDay = "Tuesday";
		Boolean result = o.matchOpeningDay(userRequestDateTime, customerOpeningDay);
	}
	
	@Test
	void userPeriodPrefInMinutesNullTest() {
		String userPeriodPreferenceSpent = "";
		int result = o.userPeriodPrefInMinutes(userPeriodPreferenceSpent);
		assertEquals(60, result);
	}

}
