//package customer;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import User.UserPreferences;
//
//	public class EateryInformationTest {	
//	private Opening opening1;
//	private Location location1;
//	private LiveQueue liveQueue1;
//	private ServiceInformation serviceInformation1;
//	private EateryInformation eateryInfo1;
//	
//	@BeforeEach
//	public void before() {
//	opening1= new Opening("Tuesday", LocalTime.of(8, 00, 00), LocalTime.of(23, 00, 00) ); 
//	location1 = new Location("Palace Grounds", "Palace Grounds Rd", "Hamilton", "ML3 6AD");
//	liveQueue1 = new LiveQueue(10);
//	serviceInformation1 = new ServiceInformation(25, Cuisine.FASTFOOD);
//		
//			
//	
//	eateryInfo1 = new EateryInformation(
//		"McDonalds", 40, opening1, location1, liveQueue1, 12, serviceInformation1);}
//
//	@Test
//	void testRequestDayReturnsDayString() {
//
//	LocalDateTime userPref1 = LocalDateTime.of(15:04:22, 078, 00);
//	String result = OpeningMatching.requestDay(userPref1.getUse)
//		assertEquals("Tuesday", result);
//	}
////
////	@Test
////	void testGetCapacity() {
////		assertEquals(40, eateryInfo1.getCapacity());
////	}
////
////	@Test
////	void testGetOpening() {
////		assertEquals(opening1, eateryInfo1.getOpening());
////	}
////
////	@Test
////	void testGetLocation() {
////		assertEquals(location1, eateryInfo1.getLocation());
////	}
////
////	@Test
////	void testGetLiveQueue() {
////		assertEquals(liveQueue1, eateryInfo1.getLiveQueue());
////	}
////
////	@Test
////	void testGetCheckedIn() {
////		assertEquals(12, eateryInfo1.getCheckedIn());
////	}
////
////	@Test
////	void testGetServiceInformation() {
////		assertEquals(serviceInformation1, eateryInfo1.getServiceInformation());
////	}
////
////}
