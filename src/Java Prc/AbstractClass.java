
abstract class AbstractClass {

	//An abstract class can have abstract methods as well as non abstract methods.
	//A base class can be made abstract class in selenium, If we dont want someone to over ride my methods
	
	/*An abstract class must be declared with an abstract keyword.
	It can have abstract and non-abstract methods.
	It cannot be instantiated.
	It can have constructors and static methods also.
	It can have final methods which will force the subclass not to change the body of the method.*/
	
	
	
	abstract void myAge();
	
	public static final int returnAge() {
		return 26;
	
	}
	
	public String myName() {
		return "Ali";
	}
	
	
	 int multiplyBy;
	    public AbstractClass( int multiplyBy ) {
	        this.multiplyBy = multiplyBy;
	        System.out.println("Abstract Construtor running");
	    }

	    public int mutiply(int val) {
	       return multiplyBy * val;
	    }
	
	
}


