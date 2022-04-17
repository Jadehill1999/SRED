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


//Add eateryName
public void addEateryName(String customerEateryName) {
this.eateryName = customerEateryName;
}
public String getEateryName() {
	return eateryName;
}

// Add capacity
public void addCapacity(int customerCapacity) {
	this.capacity = customerCapacity;
}
public int getCapacity () {
	return capacity;
}

// Add opening
public void addOpening(Opening customerOpening) {
	this.opening = customerOpening;
}
public Opening getOpening() {
	return opening;
}

// Add location
public void addLocation(Location customerLocation) {
	this.location = customerLocation;	
}
public Location getLocation() {
	return location;
}

//Update Live Queue
public void updateLiveQueue(LiveQueue customerLiveQueue) {
	this.liveQueue = customerLiveQueue;
}
public LiveQueue getLiveQueue() {
	return liveQueue;
}

// Add Checked In
public void addCheckedIn(int customerCheckedIn) {
	this.checkedIn = customerCheckedIn;
}

public void deductCheckedIn(int customerCheckedOut) {
	this.checkedIn = customerCheckedOut;
}

public int getCheckedIn() {
	return checkedIn;
}

// Add Service Information
public void addServiceInformation(ServiceInformation customerServiceInformation) {
	this.serviceInformation = customerServiceInformation;
}
public ServiceInformation getServiceInformation() {
	return serviceInformation;
	
}

};