package customer;

import java.time.*;


public class Search {
	
	// Create a new list variable for the search 
	
	// Opening requirements
	// Day parser to convert end user LocalDateTime into day int (Opening class)
	// Time parser to convert end user LocalDateTime into time for comparison with Opening class 
	// Boolean to match day
	// Boolean to match time (isOpen)
	
	// Service period requirements
	// Period Spent time sorted into categories to match end user preferences;
	// Quick bite <= 45, Average >45 <89, Leisurely >= 90
	// nullable?
	// Cuisine == customer preference(s) perhaps give end user option to choose more than one and pass in a list
	// iterate through end user list and match against customer cuisine
	// nullable?
	
	// Location requirements
	// Have a postcode letter list - assign a value and bubble sort?
	// for this project use postcode numbers as ranks of closeness.
	// apply list of matching customers (from above), iterate through and sort according to the postcode closeness.
	// save and deliver the new list with customers in the correct order for the end user.  Must include cuisine information and time category
	// limit the maximum number of results in order to reduce end user choice when no parameters are entered.

}
