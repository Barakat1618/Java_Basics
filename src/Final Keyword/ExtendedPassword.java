
public class ExtendedPassword extends Password {

	private int newPassword;
	
	public ExtendedPassword(int password) {
		super(password);
		this.newPassword = password;
		storingPassword();//Its calling the parent method
	}

	
	//In the parent we did all the encryption just to avoid showing outside world the password. 
	//By the below override method we were able to change the functionality completely and show actual password to the world even though 
	//we used private access modifier
	//This is security threat now to avoid the methods to be overridden we can use final keyword in the parent class method
	//This avoids us to override that method. Ex: Below method
	
	
	//@Override
	//public void storingPassword() {
	//	System.out.println("Storing password as : " + this.newPassword);
	//}

	//Classes can also be made final so that they cannot be extended
	
	
}
