package single_inheritance;

//Single level Inheritance Program
class CarClass {
	public int wheels = 4;
	public int doors = 4;
	
	public void property1() {
		System.out.println("can run on road");
	}
	
	public void property2() {
		System.out.println("can sit 4 persons comfertably");
	}
	
	public void property3() {
		System.out.println("runs on fuel");
	}
}

class AltoCarClass extends CarClass {
	String altoCarColor = "red";
	String engineType = "1000cc";
	String category = "minicar";
	
	public void altoCarProperties() {
		System.out.println("--Properties of alto car---");
		System.out.println("Alto car color:" + altoCarColor);
		System.out.println("Alto car engineType:" + engineType);
		System.out.println("Alto car category:" + category);
	}
}


public class SingleInheritanceDemo {
	public static void main(String args[]) {
		AltoCarClass alt = new AltoCarClass();
		System.out.println("Number of Wheels:" + alt.wheels);
		System.out.println("Number of Doors:" + alt.doors);
		alt.property1();
		alt.property2();
		alt.property3();
		alt.altoCarProperties();
	}
}
