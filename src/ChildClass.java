
public class ChildClass extends ParentClass{

	private String brand;
	public int numberPlate;
	
	public static int num = 10;
	public int age = 10;
	
	public static void gears() {
		System.out.println("Child gears");
	}
	
//	public void nonStaticMethod() {
//		System.out.println("Child non static method");
//	}
	
	
//Static methods cannot use non static variables
//Example: There is a Math class now if i call Math.random() where random is a static method suppose 
//if its using non static variables which instance of variable it should use. So its prohibited in java
//	public static void staticMethod() {
//		age = age+ 10;
//	}
	
	public void method1() {
		System.out.println("This method 1 of Child class");
	}
	
	public void method2() {
		System.out.println("This method 2 of Child class");
	}
}
