
public class StringBuilderAndStringFormatting {

	public static void main(String[] args) {
		 
		
		//This is Bad Practice because every time for a below instance a new String is created
		String info = " ";
		info+= "Hello Iam Bob";
		info+= " ";
		info+= "the Builder";
 
		StringBuilder  sb = new StringBuilder("");
		sb.append("Hello");
		sb.append(" ");
		sb.append("World");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("Hello Iam Roger ").append("and ").append("I am a Lion Tamer");
		System.out.println(s.toString());
		
		
		//////////////////////////FORMATTING//////////////////////////
		
		System.out.print("Here is some text .\t That was a tab\nThat was a new line\n");
		
		//Below 10d means store the value of 5 in 10 bytes field from right hand side
		//Below -10d means store the value of 5 in 10 bytes field from left hand side
		System.out.printf("Total cost %10d; Quantity is %d \n", 5,120);
		System.out.printf("Total cost %-10d; Quantity is %d \n", 5,120);
		System.out.println();
		
		for(int i=0; i<20; i++) {
			System.out.printf("%s : %2d%s\n","Count is running for ", i , "Th time.");
		}
		
		
		//Formatting Floating Point Values
		System.out.printf("Total Value : %.2f\n", 5.678);
		
		//Here -%9.2f means store the value 9 bytes field from left hand side including point as 1 byte
		System.out.printf("Total Value : %9.2f", 678.556);
		System.out.println();
		System.out.printf("Total Value : %-9.2f\n", 678.556);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		
	}

}
