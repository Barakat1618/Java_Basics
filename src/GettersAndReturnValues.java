
class GARV {
	String name;
	int age;
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int yearsLeftForRetirement() {
		int years = 65 - age; 
		return years;
	}
}


public class GettersAndReturnValues {

	public static void main(String[] args) {
		
		GARV garv = new GARV();
		garv.name = "Ali";
		garv.age = 25;
		
		
		System.out.println(garv.getName() + "      " + garv.getAge());
		int years = garv.yearsLeftForRetirement();
		
		System.out.println( garv.getName() + " Years left for your is : " + years);

	}

}
