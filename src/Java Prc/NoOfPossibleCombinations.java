
public class NoOfPossibleCombinations {

	public static void main(String[] args) {

		String word = "champion";
		String copyWord = word;
		int sum = 1;
		
		for(int i= word.length()-1; i>=0; i--) {
			sum = sum * (i+1);
		}
		
		System.out.println("No of permutations " + sum);
int count =1;
int countFactorial=1;
		for(int i=0; i<=word.length()-1; i++) {
			count =0;
			countFactorial=1;
			for(int j =0; j<=word.length()-1; j++ ) {
				
				if(word.charAt(i)== word.charAt(j) &&  word.charAt(i) != ' ') {
					System.out.println(word.charAt(i) + "is same as " + word.charAt(j));
					count++;
				}
			}
			
			
			word = word.replace(word.charAt(i), ' ');
			System.out.println(count + " count value ");
			for(int k= count; k>0; k--) {
				countFactorial = countFactorial * (k);
				//System.out.println(countFactorial);
			}
			
			
			sum = sum/countFactorial;
			
			System.out.println(sum);
			
		}
		
		
	}

}
