
public class MaxAndMin {

	public static void main(String[] args) {
		int [] array = {2,5,10,9,6,1};
		
		
		int minElement = Integer.MAX_VALUE;

		for(int i=0; i<=array.length-1;i++) {
			if(minElement > array[i]) {
				minElement = array[i];
			}
			
		}
		
		System.out.println(minElement);
		
		
		int maxElement = Integer.MIN_VALUE;

		for(int i=0; i<=array.length-1;i++) {
			if(maxElement < array[i]) {
				maxElement = array[i];
			}
			
		}
		
		System.out.println(maxElement);

	}

}
