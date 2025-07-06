
public class ExpressionsWhitespacesStatementsIndentation {

	public static void main(String[] args) {
		
		
		/////////////Expressions/////////
		
		//myVariable = 50
		//"Printed"
		//myVariable == 50
		//myVariable++
		//myVariable--
		
		//The above lines are considered as expressions
		
		
		//////////Statements///////
		
		//int myVariable = 50;
		//myVariable++;
		//System.out.println("Printed");
		
		//The above lines are considered as statements as the line is ending with a semicolon
		
		// WhiteSpaces are those gaps that we provide between the keyword and 
		//variable name or in between the assignment operator and assigned value
		
		//Indentation is representing the code with spaces in more readable format.
		int myVariable = 50;
		if(myVariable == 50) {
			System.out.println("Printed");
		}
		
		myVariable++;
		myVariable--;
		System.out.println("This is a test.");
		System.out.println("This is " +
		"another " +
		"Still More");
		
		
		int anotherVariable = 50;
		myVariable--;
		System.out.println("This is another one.");
		

	}

}
