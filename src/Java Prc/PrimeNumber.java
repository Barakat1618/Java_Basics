import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println(primeNumbers(30));

	}

	public static int primeNumbers(int limit) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int k = 1; k <= limit; k++) {
			list.add(k);
		}

		int count = list.size();
		
	    for (int i = 3; i <= count;i++) {
	    	
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					list.remove(list.indexOf(i));
					break;
				}
				
				
			}
		}

	    list.remove(0);
	    int sum = 0;
		for (int l = 0; l < list.size(); l++) {
			System.out.println(list.get(l));
			sum = sum+ list.get(l);
		}
		return sum;
	}
}
