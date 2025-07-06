import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = 1;
		int sum = 0;
		System.out.println("Enter number #" + count + ":");
		boolean hasNextInt = scanner.hasNextInt();
		
		while (hasNextInt) {

			int number = scanner.nextInt();
			count++;

			if (count <= 11) {
				if (count == 11) {
					sum += number;
					break;
				} else {
					System.out.println("Enter number #" + count + ":");
					sum += number;
				}
			} else {
				break;
			}
			hasNextInt = scanner.hasNextInt();
		}

		if (hasNextInt == false) {
			System.out.println("Please enter a valid input");
		} else {
			System.out.println("Sum of numbers entered is : " + sum);
		}
		
		scanner.close();
	}

}
