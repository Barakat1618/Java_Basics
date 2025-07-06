
public class StaticTest {

	private int instanceVariable;
	private static int instanceStaticVariable;
	private String name;
	
	
	public StaticTest(String name) {
		super();
		this.name = name;
		this.instanceVariable++;
		this.instanceStaticVariable++;
	}


	public int getInstance() {
		return instanceVariable;
	}


	public String getName() {
		return name;
	}


	public static int getInstanceStaticVariable() {
		return instanceStaticVariable;
	}
	
}
