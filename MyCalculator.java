package week1.day2;

public class MyCalculator 
{

	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		int sum = calc.add(1, 12, 30);
		int difference = calc.sub(54, 19);
		int multiply = calc.mul(12, 12);
		int quotient = calc.div(250, 5);
		System.out.println("Addition: " + sum);
		System.out.println("Subtraction: " + difference);
		System.out.println("Multiplication: " + multiply);
		System.out.println("Division: " + quotient);

	}

}
