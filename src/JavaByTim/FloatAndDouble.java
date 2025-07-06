import java.util.Scanner;

public class FloatAndDouble {

	public static void main(String[] args) {

		// int has a width of 32 bits ie 4 bytes
		int myIntValue = 5 / 3;

		//float has a width of 32 bits ie 4 bytes
		// Float has 7 precision values after the decimal point
		float myFloatValue = 5f / 3f;

		//Double has a width of 64 bits ie 8 bytes
		// Double has 16 precision values after the decimal point
		double myDoubleValue = 5f / 3f;
		
		System.out.println(myIntValue);
		System.out.println(myFloatValue);
		System.out.println(myDoubleValue);
		
		//We can separate float and double precision values with underscore as well for better understanding
		float myFloatNumber = 3_44.4_56_867f;
		double myDoubleNumber = 3_44_89_123.463_56_867d;
	
		///////Challenge//////
		//Convert given number of pounds to kilograms
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the pounds that you want it to convert to kilograms...");
		double pounds = input.nextDouble();
		double kilograms =  (pounds * 0.45359237d);
	    System.out.println("Converted " + pounds + " pounds into kilograms and the value in kilograms is : " + kilograms);	

	}

}
