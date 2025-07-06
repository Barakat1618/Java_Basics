
public class ParsingValuesFromString {

	public static void main(String[] args) {
		
		
		String intNumberString = "2018";
		System.out.println(" intNumberString = " + intNumberString);
		
		int number =  2018;
		System.out.println("number = " + number);
		
		intNumberString += 1;
		number += 1;
		
		System.out.println(" intNumberString = " + intNumberString);
		System.out.println(" number = " + number);
		
		//Parsing is converting a number from String format to any other datat type ex: int,double,long,short
		
		number = Integer.parseInt(intNumberString);
		System.out.println("This is converted from String to Integer : " + number);
		
		String doubleNumberString = "2018.856";
		System.out.println("doubleNumberString = " + doubleNumberString);
		
		double doubleNumber =  2018.856;
		System.out.println("doubleNumber = " + doubleNumber);
		
		doubleNumber = Double.parseDouble(doubleNumberString);
		System.out.println("This is converted from String to Double : " + doubleNumber);
		
		

	}

}
