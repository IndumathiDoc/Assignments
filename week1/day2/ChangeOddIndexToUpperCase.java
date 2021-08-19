package week1.day2;


public class ChangeOddIndexToUpperCase 
{

	public static void main(String[] args)
	{
		String test = "changeme";
		char[] ch = test.toCharArray();
		String result = "";
		
		for (int i = 0; i < ch.length; i++)
		{
			if(i%2!=0)
			{
				
				result= result+(Character.toUpperCase(ch[i]));
			}
		}
		System.out.println(result);
	}

}
