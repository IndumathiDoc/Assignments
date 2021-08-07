package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		int digit;
		int sum = 0;
		
		while (number > 0)
		{
			digit = (number%10);
			System.out.println("The reminder is "+digit);
			sum = sum + digit;
			System.out.println("The sum is "+sum);
			number = (number/10);
			System.out.println("The number is now "+number);
	
		}
		
		System.out.println("The final sum is "+sum);

	}

}
