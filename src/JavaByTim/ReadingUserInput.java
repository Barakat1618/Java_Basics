import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//If I use nextInt(); at first after entering the yearOfBirth 
		//the input scanner terminates because of the enter key.
		
		System.out.println("Enter your year of birth :");
		boolean hasNextInt = scanner.hasNextInt();  //This checks the next input entered is an Int or not.
		
		if(hasNextInt) {
			
			int yearOfBirth = scanner.nextInt();
			int age = 2018 - yearOfBirth;
			
			if(age >=0 && age <=100 ) {

				//To resolve enter key issue.
				scanner.nextLine();
				
				System.out.println("Enter your name :");
				String name = scanner.nextLine();
				System.out.println("Your name is : "+ name + ". And you are " + age + " years old.");
			}else {
				System.out.println("Enter a valid year of birth.");
			}
			
			
		}else {
			System.out.println("Could not parse the year of birth");
		}
		
/////////////////////ALWAYS CLOSE THE SCANNER OR ELSE IT GIVES MOST WERID RESULTS IN LARGER APPLICATIONS//////		
		scanner.close();
		
		

	}

}
