
public class IfElse {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		if (score < 5000 && score > 1000) {
			System.out.println(" Your score was less than 5000 but greater than 1000");
		} else if (score < 1000) {
			System.out.println("Your score was less than 1000");
		} else {
			System.out.println("None of the above is true.");
		}

		// This statement is valid if(gameOver). Here in the brackets we are checking
		// for true
		// and gameOver is already assigned to true here.
		if (gameOver) {

			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

		////////// Challenge///////

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final second score was :" + finalScore);

		}

		//Here in the above code we have declared (int finalScore) twice at different situations of if block
		//And we did not get any error because the scope of the variable is visible only within the curly braces
		//If we are declaring the variables and initializing them globally we can use them any where within the code.

		
		if(gameOver)
			System.out.println("Only one statement is excuted. If there are no curly braces after the if statement");
		
		System.out.println("This will be executed any how it does not come under if block");
		
		
	}

}
