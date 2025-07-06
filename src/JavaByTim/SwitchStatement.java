
public class SwitchStatement {

	public static void main(String[] args) {
		 
		int value =1;
		
		if(value == 1) {
			System.out.println("Value was one.");
		}else if(value == 2) {
			System.out.println("Value was two.");
		}else {
			System.out.println("Value was not 1 or 2");
		}
		
		//The above case can also be covered with switch statements.
		
		int switchValue = 3;
		int value1= 1;
		
		switch(switchValue) {
		
// We cannot use variable after case keyword it should be number, char, double or String based on String value.
//In that case If Else is considered more flexible.
		
		case 1:
			System.out.println("Value was one.");
//Using break is a must. If we don't use break keyword all the other cases will run until default case.
			break;
		case 2:
			System.out.println("Value was two.");
			break;	
		case 3: case 4: case 5:
			System.out.println("The value is either 3 or 4 or 5.");
			System.out.println("The actual value was : " + switchValue);
			break;
			
		default :
				System.out.println("Number was greater than 5");
		    break;
		}
		
	
		char switchChar = 'F';
		
		switch(switchChar) {
		
		case 'A': 
			System.out.println("The Character was A");
			break;
			
		case 'B':
			System.out.println("The Character was B");
		   break;
		   
		case 'C': 
			System.out.println("The Character was C");
			break;
			
		case 'D':
			System.out.println("The Character was D");
		   break;
		   
		case 'E':
			System.out.println("The Character was E");
		   break;
		   
		   default :
			   System.out.println("Not found A,B,C,D,E.");
		break;
		
		} 
		
		
		String month = "Febraury";
		
		switch(month.toUpperCase()) {
		
		case "JANUARY" :
			System.out.println("Month entered was JANUARY");
			break;
		case "FEBRAURY" :
			System.out.println("Month entered was FEBRAURY");
			break;
		case "MARCH": case "APRIL": case "MAY":
			System.out.println("Month entered was " + month );
			break;
			
		default :
			System.out.println("None of the above months were entered");
		    break;
		}
	}

}
