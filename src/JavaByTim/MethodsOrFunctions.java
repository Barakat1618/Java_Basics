
public class MethodsOrFunctions {

	public static void main(String[] args) {

		/*
		 * boolean gameOver = true; int score = 800; int levelCompleted = 5; int bonus =
		 * 100;
		 * 
		 * if (gameOver) {
		 * 
		 * int finalScore = score + (levelCompleted * bonus);
		 * System.out.println("Your final score was " + finalScore); }
		 * 
		 * 
		 * score = 10000; levelCompleted = 8; bonus = 200;
		 * 
		 * if (gameOver) { int finalScore = score + (levelCompleted * bonus);
		 * System.out.println("Your final second score was :" + finalScore);
		 * 
		 * }
		 */

		// Here in the above code if we look carefully we are using the if block twice
		// with the same code
		// Repeating the code twice takes up more space and memory and makes code more
		// complicated if we call it many times.
		// So we opt for a more efficient way ie using Methods

		//////// Calling a method///////////
		// Since the method is static no need of creating an object here.

		System.out.println("Your final second score was : " + calculateScore(true, 800, 5, 100));
		
		//The below methods returns -1 value and we have used -1 value because in programming language 
		//-1 is used to indicate invalid value or value not found. 
		
		
		System.out.println("Your final second score was : " + calculateScore(false, 800, 5, 100));
		System.out.println("Your final second score was : " + calculateScore(true, 10000, 8, 200));
		
		System.out.println(displayHighScorePosition("Bob", calculateHighScorePosition(1500)));
		System.out.println(displayHighScorePosition("Sue", calculateHighScorePosition(900)));
		System.out.println(displayHighScorePosition("Percy", calculateHighScorePosition(400)));		
		System.out.println(displayHighScorePosition("Gilbert", calculateHighScorePosition(50)));

		System.out.println(displayHighScorePosition("Meenaz", calculateHighScorePosition(1000)));		
		System.out.println(displayHighScorePosition("Sadiya", calculateHighScorePosition(500)));
		System.out.println(displayHighScorePosition("Ali", calculateHighScorePosition(100)));

		
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		// Here int means return a integer value. If its void then no need of returning
		// anything.
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			return finalScore;
		} else
			// I haven't used any curly braces because i need to execute only one statement
			// in the else block.
			return -1;

	}
	
	
	///////////Challenge////////
	
	public static String displayHighScorePosition(String name, int position) {
		
		return name + " managed to get into the position " + position + " on the high score table";
	}
	
	public static int calculateHighScorePosition(int thePlayerScore) {
		
		/*
		if(thePlayerScore >= 1000) {
			 return 1;
	    }else if (thePlayerScore >= 500 && thePlayerScore < 1000 ) {
		     return 2;
	    }else if(thePlayerScore >= 100 && thePlayerScore < 500) {
	    	return 3;
	    }else {
	    	return 4;
	    }
	    */
		
		int positionOnScoreTable = 4;
		if(thePlayerScore >= 1000) {
			positionOnScoreTable = 1;
	    }else if (thePlayerScore >= 500 && thePlayerScore < 1000 ) {
	    	positionOnScoreTable = 2;
	    }else if(thePlayerScore >= 100 && thePlayerScore < 500) {
	    	positionOnScoreTable = 3;
	    }
		
		return positionOnScoreTable;
		
		
		
	}

}