package customer;



public class EateryInformation {

// properties
private String eateryName;
private int capacity;
private Opening opening;
private Location location;
private LiveQueue liveQueue;
private int checkedIn;
private ServiceInformation serviceInformation;


// constructor
public EateryInformation(String eateryName, int capacity, Opening opening, Location location, LiveQueue liveQueue, int checkedIn, ServiceInformation serviceInformation) {
this.eateryName = eateryName;
this.capacity = capacity;
this.opening = opening;
this.location = location;
this.liveQueue = liveQueue;
this.checkedIn = checkedIn;
this.serviceInformation = serviceInformation;
}


};