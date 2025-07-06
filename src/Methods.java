
class Human {
	String name;
	int age;
	
	
	public void speak() {
		System.out.println("My name is : " + name + " and My age is :" + age);
	}
	
	public void sayHello() {
		System.out.println("Hello There !!!!!");
	}
}




public class Methods {

	public static void main(String[] args) {
		Human human1 = new Human();
		
		human1.name = "Ali";
		human1.age = 25;
		
		human1.speak();
		human1.sayHello();
		
		Human human2 = new Human();
		human2.name = "Sabiya";
		human2.age = 24;
		
		System.out.println();
		System.out.println();
		
		human2.sayHello();
		human2.speak();
	}

}
