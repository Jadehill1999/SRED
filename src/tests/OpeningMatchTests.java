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
	private ArrayList<EateryInformation> dbEateries;
	private AddedEateries addedEateries = new AddedEateries();

	@BeforeEach
	void before() {
	
	addedEateries.addInformation();
	dbEateries = addedEateries.getEateries();
	
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

	@Test
	void userPeriodPrefInMinutesTest() {
		String userPeriodPreferenceSpent1 = "Quick bite";
		String userPeriodPreferenceSpent2 = "Leisurely";
		int result1 = o.userPeriodPrefInMinutes(userPeriodPreferenceSpent1);
		int result2 = o.userPeriodPrefInMinutes(userPeriodPreferenceSpent2);
		assertEquals(45, result1);
		assertEquals(90, result2);
	}
}
