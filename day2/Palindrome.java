package week1.day2;

public class Palindrome
{

	public static void main(String[] args)
	{
		String str = "madam";
		String rev = "";
		
		for (int i = str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("This is Plaindrome");
		}
		else
		{
			System.out.println("This is not Palindrome");
		}
	}

}
