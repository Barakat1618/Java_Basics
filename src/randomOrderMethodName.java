
public class randomOrderMethodName extends ParentClass{

	static int id;
	public static void main(String[] args) {
		name1(null);
		System.out.println(id);
		gears();
		ParentClass pc = new ParentClass();
		pc.gears();

	}
	
	static public void name() {
		System.out.println("Didnt know about this");
	}
	
	public static void name1(String name) {
		System.out.println(name);
	}
	
	public static  void gears() {
		System.out.println("Random order gears");
	}

}
