package week1.day2;

public class PrintDuplicateArray {

	public static void main(String[] args)
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len = arr.length;
		int count = 0;
		
		for (int i = 0; i < arr.length-1; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (i == j)
				count ++;
			}
		}
		if(count>0)
		{
			System.out.println("The array is "+arr[0]);
		}
	}

}
