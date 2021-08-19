package week1.day2;

import java.util.Arrays;

public class FindSecondLargetInArray 
{
	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("The second largest number is: "+data[data.length-2]);
	}

}
