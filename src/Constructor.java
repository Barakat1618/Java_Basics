
class Constructors{
	
	private String name;
	private int age;
	
	private Constructors(String name) {
		this(27);
		System.out.println("Only Name Constructor is running " + name);
		this.name = name;
	}
	
	private Constructors(int age) {
		System.out.println("Only Age Constructor is running " + age );
		this.age = age;
	}
	
   public Constructors(String name, int age) {
	   this("Bob");
	   //Calling constructor within a constructor this statement should always be on top
	   System.out.println("Both Name and Age Constructor is running " + name + " and " + age);
	   this.name = name;
	   this.age = age;
   }
}



public class Constructor {

	public static void main(String[] args) {
		
		Constructors const1 = new Constructors("Arnie",25);

	}

}
