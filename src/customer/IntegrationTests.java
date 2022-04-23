package customer;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import User.UserPreferences;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntegrationTests {
	
	RecommendedEateries r;
	ArrayList<EateryInformation> dbEateries;
	AddedEateries addedEateries = new AddedEateries();

	@BeforeEach
	public void before(){
		
	r = new RecommendedEateries();
	addedEateries.addInformation();
	dbEateries = addedEateries.getEateries();
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
