public class NormalClass extends AbstractClass{

	
	public NormalClass(int multiplyBy) {
		super(multiplyBy);
	}
	
	//If we have a constructor in Abstract class we are forced to have a constructor in my subclasses as well.
	//We are forced to have abstract methods if we extend it.
	
	@Override
	void myAge() {
		System.out.println("My age is : " + AbstractClass.returnAge());
		
	}
	
	public String myName() {
		return "Ali Shaikh";
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(returnAge());
		
		AbstractClass ac = new NormalClass(5);
		ac = new TimesWhat(6);
		
		System.out.println(ac.myName());
		
	}
	
}


class ABD extends AbstractClass{

	public ABD(int multiplyBy) {
		super(multiplyBy);
		// TODO Auto-generated constructor stub
	}

	@Override
	void myAge() {
		// TODO Auto-generated method stub
		
	}
	
}


class TimesTwo extends AbstractClass {
    public TimesTwo() {
        super(2);
    }

	@Override
	void myAge() {
		// TODO Auto-generated method stub
		
	}
}

class TimesWhat extends AbstractClass {
    public TimesWhat(int what) {
        super(what);
    }

	@Override
	void myAge() {
		// TODO Auto-generated method stub
		
	}
}




