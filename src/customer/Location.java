package customer;

public class Location {

// properties
private String addressLineOne;
private String addressLineTwo;
private String addressLineThree;
private String postcode;

//constructor
public Location(String addressLineOne, String addressLineTwo, String addressLineThree, String postcode) {
this.addressLineOne = addressLineOne;
this.addressLineTwo = addressLineTwo;
this.addressLineThree = addressLineThree;
this.postcode = postcode;

	}

public void updateAddressLineOne(String customerUpdateAddressLineOne) {
	this.addressLineOne = customerUpdateAddressLineOne;
}
public String getAddressLineOne() {
	return addressLineOne;
}

public void updateAddressLineTwo(String customerUpdateAddressLineTwo) {
	this.addressLineTwo = customerUpdateAddressLineTwo;
}
public String getAddressLineTwo() {
	return addressLineTwo;
}

public void updateAddressLineThree(String customerUpdateAddressLineThree) {
	this.addressLineThree = customerUpdateAddressLineThree;
}
public String getAddressLineThree() {
	return addressLineThree;
}

public void updatePostcode(String customerUpdatePostcode) {
	this.postcode = customerUpdatePostcode;
}
public String getPostcode() {
	return postcode;
}

};
