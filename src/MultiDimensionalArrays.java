
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		int[][] values = new int[3][4];
		values[0][0] = 4;
		values[0][1] = 5;
		values[1][0] = 6;
		values[0][2] = 3;
		values[1][1] = 4;
		values[1][2] = 5;
		values[1][3] = 6;
	
		
		for(int row=0; row<values.length;row++) {
			for(int col =0; col<values[row].length;col++) {
				System.out.print(values[row][col] + "\t");
			}
			System.out.println();
		}
		
		for(int i=0; i<3; i++) {
		System.out.println();
		}
		
		
		int[][] grid = { 
				{2,3,4},
				{5,6,7},
				{1,2,3},
				{33,22,44,10}
		};
		
		
		for(int row=0; row<grid.length;row++) {
			for(int col =0; col<grid[row].length;col++) {
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		

	}

}
