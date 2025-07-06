
public class Strings {

	public static void main(String[] args) {
		
		String myString = "This is a String.";
		System.out.println("myString is equal to " + myString);
		
		myString = myString + ", This is even more ";
		System.out.println("myString is equal to " + myString);
		
		myString = myString + "\u00A9 2015";
		System.out.println("myString is equal to " + myString);
		
		String numberString = "200.99";
		numberString = numberString + "0.11";
		System.out.println("numberString is equal to "+ numberString);
		
		int myInteger = 88;
		int myIntValue =22;
		
		numberString = numberString + myInteger + myIntValue;
		System.out.println("numberString is equal to " + numberString);
		
		String lastString = "10.88";
		double myDouble = 23.678;
		lastString = lastString + myDouble;
		System.out.println("numberString is equal to " + lastString);
	}

}
