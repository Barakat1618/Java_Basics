
public class Friends {

	public static int instances;
	public final int MY_LUCKY_NUMBER;
	private String name;
	
	public Friends(String name, int luckyNumber) {
		this.name = name;
		this.MY_LUCKY_NUMBER = luckyNumber;
		this.instances++;
	}

	public String getName() {
		return name;
	}
	
	//Final variable can be initialized only at the beginning or in the constructor cannot be initialized from anywhere else.
	
	//We can also give constructor access modifier as private to avoid instantiating the object. Ex Math class
	//Math math = new Math(); Not Allowed
	
	//If a value is constant through out the program than it is best to use a final static keyword once.
	
	//By Creating a class final ex: public final class Math{}
	//We are not allowed to extend that class (Prevent from being sub classed)
	
	//If a method is made final it cannot be overrided in child class.
}


