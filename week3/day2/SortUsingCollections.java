package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {
		
		
		String[] arr = {"Aspire systems", "CTS", "Wipro", "HCL"};
		List<String> companies = new ArrayList<String>(Arrays.asList(arr));
		
		//size of the array
		System.out.println("The size of the Array is: "+ companies.size());
		
		//sort the array
		Collections.sort(companies);
		System.out.println("The sorted array is: "+companies);
		
		//reverse the array
		Collections.reverse(companies);
		System.out.println("The reverse ordered array is: "+companies);

	}

}
