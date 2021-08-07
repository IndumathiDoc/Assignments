package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 153;
		int original;
		int calculated = 0;
		int reminder;
		
		original = number;
		while (original > 0)
		{
			reminder = (original%10);
			original = (original/10);
			calculated =( calculated+(reminder*reminder*reminder));
			
		}
		if (calculated == number) 
		{
			System.out.println("The number "+calculated+ " is Armstrong");
		}
		

	}

}
