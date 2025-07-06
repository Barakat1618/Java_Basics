
public class Password {

	private int enCryptedPassword;
    private static final int CONSTANT_VALUE = 789654;
    
    
	public Password(int password) {
		this.enCryptedPassword = enCrypted(password);
		storingPassword();
	}
	
	private int enCrypted(int password) {
		this.enCryptedPassword = password ^ this.CONSTANT_VALUE;
		return this.enCryptedPassword;
	}
	
	
	public final void storingPassword() {
		System.out.println("Storing password as " + this.enCryptedPassword);
	}
	
	public void login(int password) {
		int temp = password^this.CONSTANT_VALUE;
		if(temp == this.enCryptedPassword) {
			System.out.println("Welcome!!!!!!!");
		}else {
			System.out.println("Wrong password.");
		}
	}
	
	
	
}
