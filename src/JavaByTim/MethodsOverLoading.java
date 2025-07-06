
public class MethodsOverLoading {

	public static void main(String[] args) {

		calculateScore("Ali", 20);
		calculateScore(35);
		calculateScore();
		
		///////////////////////////////CHALLENGE/////////////
		System.out.println(calFeetAndInchesToCentimeters(5,18));
		System.out.println(calFeetAndInchesToCentimeters(30));
		System.out.println(calFeetAndInchesToCentimeters(-5,8));
		System.out.println(calFeetAndInchesToCentimeters(-12));
		System.out.println(calFeetAndInchesToCentimeters(6,0));
		System.out.println(calFeetAndInchesToCentimeters(0,0));
		System.out.println(calFeetAndInchesToCentimeters(157));
		

	}

	// Method Overloading is a feature that allows us to have more than one method with same name,
	// so as long as we use  different parameters
	
	//Method Overloading is good practice, Using different names for methods is a bad practice.
	//Example addition of 2 numbers,addition of 3 numbers,addition of 4 numbers
	//Instead of creating 3 methods with 3 different names we can opt for Method Overloading with different parameters.
	
	//Perfect Example for method overloading is System.out.println();
	
	//System.out.println("String"));
	//System.out.println(30);
	//System.out.println(7.66);
	
    //Above we can see that System.out.println() is used for various data types.
	
	// Here we used two parameters.
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points.");
		return score * 1000;
	}

	// Here we have used one parameter.
	public static int calculateScore(int score) {
		System.out.println("Unnamed player " + " scored " + score + " points.");
		return score * 1000;
	}

	// Here we didn't use any parameters. Java calls the methods based on parameters
	public static int calculateScore() {
		System.out.println("Player didn't participate in the game. So his score is considered as 0");
		return 0;
	}

	///////////////////////////////////////// CHALLENGE///////////////////////////////////
	public static double calFeetAndInchesToCentimeters(double feet, double inches) {

		if (feet < 0) {
			return -1;
		}

		else {

			if ((inches >= 0) && (inches <= 12)) {
           
				double inchesCalculation = inches * 2.54; 
				double feetCalculation = feet * 30.48;
				
				double total = inchesCalculation + feetCalculation;
				
				System.out.println( feet + " feet  and " + inches + " inches" + ". When converted to cm value is " + total);
				
				return total;
				
			} else {
				return -1;
			}
		}
	}
		
		
		
		public static double calFeetAndInchesToCentimeters(double inches) {

			if(inches < 0) {
				return -1;
			}else {
				double feet = (int) inches /12;
				double remainingInches = (int) inches % 12;
				System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
			return calFeetAndInchesToCentimeters(feet,remainingInches);
			}
			
		
			}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	