
public class MainTest {

	public static void main(String[] args) {
		String value = "234abcd56";
		char character = ' ';		
		int sum =0;
		
		for(int i=0; i<value.length(); i++) {
			character = value.charAt(i);
			String value2 = "" + character;
			
			try {
				
				int number = Integer.parseInt(value2);
				sum = sum + number;
			}catch(Exception e) {
				
			}
		}
		
		System.out.println("The total is : " + sum);
	}
}
