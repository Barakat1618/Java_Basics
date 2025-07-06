

class EExtra{
	
	
	int id; 
	
	//This stores the value in the count as per the Class instances
	//example foe ee intance the count value is  0 for ee1 it is 1 for ee2 its is 2
	public static int count = 0;
	
	public EExtra() {
		id = count;
		System.out.println("Constructor Running");
		System.out.println("Count is incrementing now the count  value is : "  + count);
		count++;
	}
	
	
	public void showName() {
		System.out.println("Id is : " + id);
	}
	
	
}
public class Extra {

	public static void main(String[] args) {
		
		EExtra ee = new EExtra();
		EExtra ee1 = new EExtra();
		EExtra ee2 = new EExtra();
		
		ee.showName();
	
		ee1.showName();
		
		ee2.showName();
		
		

	}

}
