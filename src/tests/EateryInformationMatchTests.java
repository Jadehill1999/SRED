package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import eatery.EateryInformation;
import preferenceMatch.EateryInformationMatch;

class EateryInformationMatchTests {
	
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
	void eaterySpaceTest() {
		int result = e.eaterySpace(eatery1);
		assertEquals(28, result);
	}
}
