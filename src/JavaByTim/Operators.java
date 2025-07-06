
public class Operators {

	public static void main(String[] args) {

		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);

		int previousResult = result;
		result = result - 1;
		System.out.println(previousResult + " -1 = " + result);

		previousResult = result;
		result = result * 10;
		System.out.println(previousResult + " * 10 = " + result);

		previousResult = result;
		result = result / 10;
		System.out.println(previousResult + " / 10 = " + result);

		previousResult = result;
		result++;

		previousResult = result;
		result = result % 2;
		System.out.println(previousResult + " % 2 = " + result);

		previousResult = result;
		result--;
		System.out.println("Result now is : " + result);

		previousResult = result;
		result += 2;
		System.out.println("Result now is : " + result);

		previousResult = result;
		result *= 10;
		System.out.println("Result now is : " + result);

		previousResult = result;
		result /= 10;
		System.out.println("Result now is : " + result);

		previousResult = result;
		result -= 2;
		System.out.println("Result now is : " + result);

		boolean isAlien = true;
		if (isAlien == true)
			System.out.println("There was an alien");
		
		int topScore = 80;
		if(topScore != 100)
			System.out.println("You haven't scored the highest marks.");
		
		int secondTopScore = 60;
		
		if((topScore > secondTopScore) && (topScore<100))
			System.out.println("topScore is greater than secondTopScore but less than 100");
		
		if((topScore > 90 ) || (secondTopScore <= 90))
			System.out.println("One of the tests is true.");
		
		int newValue = 50;
		if(newValue == 50)
			System.out.println("This is true.");
		
		boolean isCar = false;
		if(isCar == true)
			System.out.println("There was a car.");
		
		isCar = true;
		// The below line is shortcut for if Else loop 
		//Meaning for below line is if isCar is true than assign 
		//it to true value to wasCar else assign false value to wasCar
		boolean wasCar = isCar ? true : false;
		if(wasCar == true)
			System.out.println("Yes!!!! There is a car");
		
		
		///////////////////////////////CHALLENGE//////////////////////
		double myFirstDouble = 20d;
		double mySecondDouble = 80d;
		
		double myDoubleTotal = (myFirstDouble + mySecondDouble) * 25;
		System.out.println(myDoubleTotal);
		
		double myRemainderValue =  (myDoubleTotal % 40);
		System.out.println(myRemainderValue);
		
		if( myRemainderValue <= 20)
		System.out.println("Total was over the limit");
		
		
		
		
		

	}

}
