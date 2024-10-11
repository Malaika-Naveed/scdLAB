package lab8;


public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public int addition(int num1, int num2)
	{
		return num1 + num2;
	}
	public int multiply(int num1, int num2)
	{
		return num1 * num2;
	}

	public static void main(String[] args)
	{
		Calculator calculate = new Calculator();
		int result1, result2;
		result1=calculate.addition(2, 4);
		result2=calculate.multiply(5, 6);
		System.out.println("Result of Addition: " +result1);
		System.out.println("Result of Multiplication: " +result2);

	}
}
