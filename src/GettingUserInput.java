import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		
		//We need to update with handling exceptions here
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the input");
		
		String text = input.nextLine();
		int value = input1.nextInt();
		double pointValue = input2.nextDouble();
		
		if(text != null) {
			System.out.println("User has entered a String input : " + text);
		}else {
			System.out.println("Please enter a valid input");
		}
		
		
		
		if(value != 0) {
			System.out.println("User has entered a Integer input : " + value);
		}else {
			System.out.println("Please enter a valid input");
		}
		
		
		
		if(pointValue != 0) {
			System.out.println("User has entered a Integer input : " + pointValue);
		}
		
		else {
			System.out.println("Please enter a valid input");
		}
		
		
		
		input1.close();
		input2.close();
		input.close();
	}

}
