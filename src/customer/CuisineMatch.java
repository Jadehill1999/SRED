package customer;

import java.util.List;

public class CuisineMatch {
	// Cuisine == customer preference(s) perhaps give end user option to choose more than one and pass in a list
	// iterate through end user list and match against customer cuisine
	// nullable?
	
	public Boolean matchCuisinePreference(Cuisine serviceCuisine, List<Cuisine> userCuisinePreference) {
		Boolean matching = false;
	
		for(Cuisine cuisine : userCuisinePreference) {
			if (cuisine == serviceCuisine) 
			{
			matching = true;
			}
		}
		
		return matching;
	}

}
