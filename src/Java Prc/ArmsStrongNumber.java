import java.util.Scanner;

public class ArmsStrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit to find whether its a armstrong number or not");
		int number = sc.nextInt();
		if(armsStrong(number) == number) {
			System.out.println("Yessssssss");
		}else {
			System.out.println("Noooooooooo");
		}
		
		if(armsStrong1(number) == number) {
			System.out.println("Yessssssss");
		}else {
			System.out.println("Noooooooooo");
		}
		
	}

	
	
	public static int armsStrong(int number) {
		
		String str = "";
		String extra="";
		str = str + number;
		int sum =0;
		for(int i=0; i<=str.length()-1; i++) {
			int digit = Integer.parseInt(extra + str.charAt(i));
			int digitSum = digit * digit * digit;
			System.out.println(digitSum);
			sum =  sum + (digitSum);
			
		}
		return sum;
		
	}
	
public static int armsStrong1(int number) {
		
		int sum =0;
		int remainderCube;
		while(number>0) {
		int remainder = number % 10;
		number = number/10;
		remainderCube = remainder * remainder * remainder;
		System.out.println(remainderCube + "///////");
		sum = sum + remainderCube;
		}
		return sum;
	}
	
	
}
