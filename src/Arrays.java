
public class Arrays {

	public static void main(String[] args) {
		int[] values = new int[3];
		values[0] = 7;
		values[1]=8;
		values[2]=9;
		
		int[] integers = { 2,3,7,8,4}; 
		
		for(int number : values ) {
			System.out.println(number);
		}
		
		//OR
		
		for(int i = 0; i<integers.length; i++) {
			System.out.print(integers[i] + "\t");
		}

	}

}
