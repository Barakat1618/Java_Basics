
public class Main {

	
	public int value =8;
	public static int anotherValue;
	
	
	public static void main(String[] args) {
		
		
		StaticTest firstInstance = new StaticTest("First Instance");
		System.out.println(firstInstance.getName() + " = " + firstInstance.getInstance());
		
		
		StaticTest secondInstance = new StaticTest("Second Instance");
		System.out.println(secondInstance.getName() + " = " + secondInstance.getInstance());
		
		//Run the code check the results 
		//Here even though instanceVariable is one and we are creating 2 objects and incrementing the instanceVariable the reults is 1 for each created Object
		//Since we did not use static keyword it is now an instance variable  which is newly created for every new instance.
		
		
		StaticTest thirdInstance = new StaticTest("Third Instance");
		System.out.println(thirdInstance.getName() + " = " + thirdInstance.getInstance());
		
		//Static instance value
		//InstanceStaticVariable value is 3 because it is a Class variable. All other objects can use this same variable but its a class variable cannot be accessed using instance of a object
		//These can be accessed using only class name only like shown below
		System.out.println(thirdInstance.getName() + " = " + StaticTest.getInstanceStaticVariable());
		//StaticTest.getInstanceStaticVariable() result of this 3 because we are incrementing static variable for every created instance Since 
		//We have created 3 instances result is 3.
		
		System.out.println(multiply(2));// This can be done static method.
		//System.out.println(anotherMultiply(1)); This cannot be done non static method requires and object
		
	}
	
	
	//A static method cannot use a instance variable. The below commented line gives us an error.
	public static int multiply(int number) {
		//return value * number;
		return 0;
	}
	
	
	//A non static method can use a static variable. The below method works fine.
	public int anotherMultiply(int number) {
		return anotherValue * number;
	}
	
	
	//Reason Static Variables or Methods are Class Variables and Methods. Hence they don't need a object to refer.
	//But a instance variable or method requires object to refer hence we cannot use instance variable in a static method.
	
	
	

}
