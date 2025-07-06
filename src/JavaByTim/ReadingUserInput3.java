import java.util.Scanner;

public class ReadingUserInput3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int number = sc.nextInt();
		int largestNumber  =number;
		int smallestNumber =number; 
		
		while(true) {
			
			try {
			System.out.println("Enter Number");
			number = sc.nextInt();
			if(number > largestNumber) {
				largestNumber  =number;
			}else if(number < smallestNumber ) {
				smallestNumber =number; 
			}}catch(Exception e) {
				break;
			}
			
		}
		
		System.out.println(" Largest Number Is : " + largestNumber);
		System.out.println(" Smallest Number Is : " + smallestNumber);
		
sc.close();
	}

}
