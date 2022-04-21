package customer;

import java.time.LocalTime;



public class AddedEateries {
	
	private Opening opening1;
	private Opening opening2;
	private Opening opening3;
	
	private Location location1;
	private Location location2;
	private Location location3;
	private Location location4;
	
	private LiveQueue liveQueue1;
	private LiveQueue liveQueue2;
	private LiveQueue liveQueue3;
	private LiveQueue liveQueue4;
	
	private ServiceInformation serviceInformation1;
	private ServiceInformation serviceInformation2;
	private ServiceInformation serviceInformation3;
	private ServiceInformation serviceInformation4;
	
	private EateryInformation eateryInformation1;
	private EateryInformation eateryInformation2;
	private EateryInformation eateryInformation3;
	private EateryInformation eateryInformation4;
	
	public void addInformation(){
	opening1 = new Opening("Tuesday", LocalTime.of(8, 00, 00), LocalTime.of(23, 00, 00) ); 
	opening2 = new Opening("Wednesday", LocalTime.of(9, 30, 00), LocalTime.of(22, 00, 00));
	opening3 = new Opening("Friday", LocalTime.of(17, 30, 00), LocalTime.of(00, 00, 00));
	
	location1 = new Location("Palace Grounds", "Palace Grounds Rd", "Hamilton", "ML3 6AD");
	location2 = new Location("123 Main Street", "Hamilton", "Lanarkshire", "ML4 7BD");
	location3 = new Location("56 Red Avenue", "Larkhall", "Lanarkshire", "ML2 8GG");
	location4 = new Location("101 Glasgow Road", "Bellshill", "Lanarkshire", "ML7 3PD");
	
	liveQueue1 = new LiveQueue(10);
	liveQueue2 = new LiveQueue(15);
	liveQueue3 = new LiveQueue(6);
	liveQueue4 = new LiveQueue(3);
	
	serviceInformation1 = new ServiceInformation(25, Cuisine.FASTFOOD);
	serviceInformation2 = new ServiceInformation(35, Cuisine.FASTFOOD);
	serviceInformation3 = new ServiceInformation(90, Cuisine.FRENCH);
	serviceInformation4 = new ServiceInformation(50, Cuisine.CHINESE);
		
			
	
	eateryInformation1 = new EateryInformation(
		"MacDonalds", 40, opening1, location1, liveQueue1, 12, serviceInformation1);
	
	eateryInformation2 = new EateryInformation(
			"BurgerQueen", 35, opening2, location2, liveQueue2, 34, serviceInformation2);
	
	eateryInformation3 = new EateryInformation(
			"Le Petite Restaurant", 20, opening1, location3, liveQueue3, 10, serviceInformation3);
	
	eateryInformation4 = new EateryInformation(
			"Moon Garden", 5, opening3, location4, liveQueue4, 3, serviceInformation4);
			
	}
}
