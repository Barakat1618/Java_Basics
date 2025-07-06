
public class Main {
 
	public static void main(String[] args) {
		
		Friends anees = new Friends("Anees", 7);
		Friends kishan = new Friends("Kishan", 12);
		Friends banta = new Friends("Banta", 2);
		Friends bhuma = new Friends("Bhuma", 13);
		
		System.out.println("Instances created until now are " + Friends.instances);
		
		//anees.MY_LUCKY_NUMBER = 5;
		//Though My_Lucky_Number is public we cannot modify it
		//Final variable can be initialized only at the beginning or in the constructor cannot be initialized from anywhere else.
		
		Password password = new Password(7867);
		password.login(1223);
		password.login(8223);
		password.login(4444);
		password.login(7867);
		ExtendedPassword anotherPassword = new ExtendedPassword(9447);
		anotherPassword.login(9908);
		anotherPassword.login(9447);
		System.out.println("**************************");
		SIBTest s = new SIBTest();
		//SIBTest.someMethod();
		System.out.println(s.owner);
		
		
		
		
	}
}
