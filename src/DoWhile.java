import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//Program until we get 5 as user input

		Scanner input = new Scanner(System.in);
		int value;
		
		do {
			System.out.println("Enter the input");
			value = input.nextInt();
		}while(value != 5);
		
		System.out.println("Gotttttt 5 !!!!!!!!!!!!");
		
		
		
	}

}
