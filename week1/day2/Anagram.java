package week1.day2;

import java.util.Arrays;

public class Anagram
{

	public static void main(String[] args) 
	{
		String s1 = "Stops";
		String s2 = "potss";
		
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		int l1 = s1.length();
		int l2 = s2.length();
		
	//	if((l1==l2) && (Arrays.))
	//	{
		//			System.out.println("This is Anagram");
		//}
		//else
		{
			System.out.println("This is not Anagram");
		}
				

	}

}
