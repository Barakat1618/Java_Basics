import java.util.Scanner;

public class ReadingUserInputChallenge2 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		////////Needs to be completed////////
		
		int counter =0;
		int order =0;
		int sum =0;
		int number = 0;
		
		while(counter < 10) {
			
			
			order = counter + 1;
			System.out.println("Enter number #" + order);
			boolean hasInt = sc.hasNextInt();
			if(hasInt) {
				number = sc.nextInt();
				sum +=number;
				counter++;
			}else {
				
				System.out.println("Enter a valid number");
				 sc.nextLine();  //(To solve Enter key problem)
			}
			
			
		}
		
		System.out.println("Sum = " + sum);

	}

}

		      