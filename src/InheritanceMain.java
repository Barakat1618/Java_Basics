
public class InheritanceMain {

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		ParentClass pc = new ParentClass();
		
		System.out.println(cc.numberPlate);
//		pc.gears();
//		pc.speed();
//		
//		cc.gears();
//		cc.engine();
		
		ParentClass pc1 = new ChildClass();
		pc1.nonStaticMethod();
		pc1.gears();

		
		ChildClass cc2 = (ChildClass) pc1;
		cc2.gears();
		cc2.nonStaticMethod();
		
//		ParentClass pc3 = (ParentClass) cc;
//		pc3.gears();
//		pc3.nonStaticMethod();
//		
//		NormalClass nc = new NormalClass();
//		nc.characteristics();
//		nc.habits();
		
		ParentClass p1 = new ChildClass();
		p1.nonStaticMethod();
		
	}
}