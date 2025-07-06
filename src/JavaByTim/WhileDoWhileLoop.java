
public class WhileDoWhileLoop {

	public static void main(String[] args) {
		
		System.out.println(isEvenNumber(2));
		System.out.println(isEvenNumber(3));
		System.out.println(isEvenNumber(7));

		
		int number =4;
		int finishedNumber = 20;
		int count =0;
		int sum =0;
		
		while(number <= finishedNumber) {
			
			number ++;
			if(!isEvenNumber(number)) {
				continue;
			}
			
			//This statement won't be executed when it enters the If statement and executes the continue keyword
			count ++;
			System.out.println("Even Number : " + number );
			
			
			if(count < 6) {
				sum += number;
			}
			
			
			
		}
		
		System.out.println("Total count of even numbers is : " + count);
		System.out.println("Total of 5 even numbers is : " + sum);
		
	}
	
	
	public static boolean isEvenNumber(int number) {
		
		if((number % 2) == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
