import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the value : ");
		int myInt = input.nextInt();
				
		if( myInt < 10 ) {
			System.out.println("Value is less than 10");
		}
		else if(myInt > 20) {			
			System.out.println("Value is greater than 20");
		}
		else {
			System.out.println("Value is in between 10 and 20");
		}

	}

}
