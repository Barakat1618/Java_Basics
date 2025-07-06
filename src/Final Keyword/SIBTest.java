
public class SIBTest {
    public static final String owner;
    
    //We cannot initialize public static final String owner in the constructor so we have to use static initializers.
    //Ex: Shown Below
    
    
    static {
        owner = someMethod();
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
    	
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public static String someMethod() {
        System.out.println("someMethod called");
        return "Ali";
    }
}
