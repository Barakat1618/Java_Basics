
class Person{
	//Classes contain 1.Data     2.Subroutines(Methods)
	 
	 // Instance Variables 
	String name;
	int age;	
}


public class ClassesAndObjects {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Ali";
		person1.age=25;		
		
		
		Person person2 = new Person();
		person2.name = "Sabiya";
		person2.age = 24;
		
		
		System.out.println(person1.name +" " + person2.name);

	}

}
