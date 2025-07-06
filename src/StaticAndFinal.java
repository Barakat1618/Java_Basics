
class Thing{
	
	public static String description;
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public int id;
	public static int count =0;
	
	
	public Thing() {
		id = count;
		System.out.println("Constructor Running");
		count++;
	}
	
	public void showName() {
		System.out.println("Object Id : " + id + ", " + description + " : " + name);
	}
	
	
	public static void showInfo() {
		System.out.println(description);
	}
	
}





public class StaticAndFinal {

	public static void main(String[] args) {
	
	//This is a class variable can be altered using class name only.
	Thing.description = "Iam a Thing";
	Thing.showInfo();
	
	System.out.println("Before creating objects, count is : " + Thing.count); 
	
	Thing thing1 = new Thing();
	Thing thing2 = new Thing();

	
	System.out.println("After creating objects, count is : " + Thing.count);
	
	thing1.name = "Bob";
	thing2.name = "Sue";
	
	
	thing1.showName();
	thing2.showName();
	
	System.out.println();
	System.out.println(Math.PI);
	System.out.println(Thing.LUCKY_NUMBER);
	}

}
