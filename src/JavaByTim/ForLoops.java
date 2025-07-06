
public class ForLoops {

	
	
	public static void main(String[] args) {
		// Square root function
		System.out.println(Math.sqrt(16)); 
		System.out.println(Math.sqrt(17)); 
		System.out.println(Math.sqrt(18)); 
		System.out.println(Math.sqrt(19)); 
		System.out.println(Math.sqrt(20)); 
		System.out.println(Math.sqrt(21)); 
		System.out.println(Math.sqrt(22)); 
		
		
		for(double i=2 ; i<=8 ; i++) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
		}
		
		System.out.println("Challenge");
		
		for(double i=8 ; i>=2 ; i--) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
		}
		
		
		System.out.println();
///////////Finding prime numbers for n values///////
	for(int i=10; i< 20; i++) {
		boolean isItAPrime = isPrime(i);
	if(isItAPrime == true) {
		System.out.println("Yes!!!!!! Its is a prime " + i);
	}else {
		System.out.println("Oh No!!!!!! It's not a prime " + i);
	}
}
	
	System.out.println();
///////////Exiting when we find 3 prime numbers///////
	int count =0;
	for(int i=0; i< 14; i++) {
		boolean isItAPrime = isPrime(i);
	if(isItAPrime == true) {
		System.out.println(i + " is a prime ");
		count++;
		
		if(count == 3) {
			System.out.println("above are the first 3 prime numbers.");
			////////////VERY IMPORTANT POINT//////////
////////////BREAK KEYWORD BREAKS THE WHOLE EXECUTION OF THE LOOP/////////
			break;
			}else {
				continue;
			}
	}else {
	}
}
		}
	
	
	public static double calculateInterest(double amount, double interestRate) {
		
		return (amount * (interestRate/100));
	}
	
	
	
	
	
	
	public static boolean isPrime(int n) {
		
		int remainder = 0;
		boolean isItAPrime = true;
		
		if(n <= 1 ) {
			//If the loop enters here the loop will terminate because we are using return statement here 
			return false;
		}else {
			for(int i =2 ; i< n ; i++) {
				
				remainder = n % i;
				if(remainder == 0) {
					isItAPrime = false;
		//If the loop enters here the loop will terminate because we are using return statement. So to avoid it
		//We are initializing a variable before, Assigning value to it and then returning that value.
					break;
				}else {
					isItAPrime = true;
				}
				
			}
			
			return isItAPrime;
		}
		
		
	}

}
