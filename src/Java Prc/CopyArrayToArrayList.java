import java.util.ArrayList;

public class CopyArrayToArrayList {

	public static void main(String[] args) {

		int[] array = new int[5];
		array[0] = 1;
		array[1] = 0;
		array[2] = 4;
		array[3] = 2;
		array[4] = 8;
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<= array.length-1; i++) {
			list.add(array[i]);
		}
		
		
		list.remove(1);
		
		array = new int[array.length-1];
		
	
		for(int i=0; i<= list.size()-1; i++) {
			array[i] = list.get(i);
		}
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
	}

}
