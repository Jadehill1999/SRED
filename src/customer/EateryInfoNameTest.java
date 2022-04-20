package customer;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EateryInfoNameTest {
	private Opening opening1;
	private Location location1;
	private LiveQueue liveQueue1;
	private ServiceInformation serviceInformation1;
	private EateryInformation eateryInfo1;
	
	@BeforeEach
	public void before() {
	opening1= new Opening("Tuesday", LocalTime.of(8, 00, 00), LocalTime.of(23, 00, 00) ); 
		
			
	
	eateryInfo1 = new EateryInformation(
		"McDonalds", 40, opening1, location1, liveQueue1, 12, serviceInformation1);}
	
	

	@Test
	void testGetEateryName() {
		assertEquals("McDonalds", eateryInfo1.getEateryName());
	}

	@Test
	void testGetCapacity() {
		fail("Not yet implemented");
	}

	@Test
	void testGetOpening() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLiveQueue() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCheckedIn() {
		fail("Not yet implemented");
	}

	@Test
	void testGetServiceInformation() {
		fail("Not yet implemented");
	}

}
