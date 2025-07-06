//////////////SETTER AND THIS || METHOD PARAMETERS\\\\\\\\\\\\\\\\\\\\



class MethodParameter{
	
	private String name;
	private int age;
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setAge(int age) {
		this.age = age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	
	
	private String getName() {
		return name;
	}
	
	private int getAge() {
		return age;
	}
	
	public void getInfo() {
		System.out.println("My name is :" + getName());
		System.out.println("My Age is :" + getAge());
	}
	
	
}


public class MethodParameters {

	public static void main(String[] args) {
		
		MethodParameter MP = new MethodParameter();
		MP.setInfo("Ali", 25);
		MP.getInfo();

		System.out.println();
		System.out.println();
		
		MethodParameter MP1 = new MethodParameter();
		MP1.setInfo("Sabiya", 24);
		MP1.getInfo();
		
	}

}
