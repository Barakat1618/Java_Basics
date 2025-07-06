
public class ArraysOfStrings {

	public static void main(String[] args) {
		
		String[] words = new String[5];
		
		words[0] = "Hello";
		words[1] = " ";
		words[2] = "There";
		
		for(String test : words) {
			System.out.println(test);
		}

		System.out.println();
		
		String[] fruits = { "apple", "banana","kiwi","gauava"};
		 
		for(int i =0 ; i<fruits.length; i++) {
			System.out.print(fruits[i] + "\t");
		}
		
		
	}

}
