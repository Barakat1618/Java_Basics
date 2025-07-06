import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int [] array = {2,5,10,9,6,1};
		int temp;
		
		for(int j=0; j<=array.length-1;j++) {
		for(int i=j+1; i<=array.length-1;i++) {
			if(array[j] > array[i]) {
				temp = array[j];
				array[j] = array[i];
				array[i]  = temp;
			}
			
		}
		}
		
		

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		
	}

}
