package eatery;

public class LiveQueue {

	// properties
private int currentWaitTime;

// constructor
public LiveQueue(int currentWaitTime) {
	this.currentWaitTime = currentWaitTime;
}

//Update Live Queue
public void updateLiveQueue(int customerCurrentWaitTime) {
	this.currentWaitTime = customerCurrentWaitTime;
}
public int getCurrentWaitTime() {
	return currentWaitTime;
}
	
};
