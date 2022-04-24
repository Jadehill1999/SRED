package customer;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import User.UserPreferences;

class EateryInformationMatchTest {
	
	private EateryInformationMatch e = new EateryInformationMatch();
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
		boolean eateryPreferenceMatch = e.preferenceMatch(eatery1, userPref1);
	// Assert
		assertEquals(true, eateryPreferenceMatch);
	}

}
