package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "PayPal India";
		String lowerCase = str.toLowerCase();
		String replaceAll = lowerCase.replaceAll("\\s", "");
		char[] array = replaceAll.toCharArray();
		
		Set<Character> newSet = new LinkedHashSet<Character>();
		Set<Character> duplicateSet = new LinkedHashSet<Character>();
		
		for (Character character : array) {
			boolean add = newSet.add(character);
			if(!add)
			{
				duplicateSet.add(character);
			}
		}
		
		System.out.println("The NewSet is: "+newSet);
		System.out.println("The Duplicate Set is: "+duplicateSet);

	}

}
