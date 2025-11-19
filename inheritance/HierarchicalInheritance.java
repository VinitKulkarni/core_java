package hierarchical_inheritance;

//Hierarchical inheritance program
class Vehical{
	public void info1() {
		System.out.println("Runs on Fuel");
	}
	
	public void info2() {
		System.out.println("It Runs on Road");
	}
}


class Car extends Vehical {
	String fuelType;
	
	//constructor
	public Car(String type) {
		fuelType = type;
	}
	
	public void carInfo1() {
		System.out.println("It carries 4 passangers");
	}
	
	public void carInfo2() {
		System.out.println("Runs faster and smoother");
	}
}


class Bus extends Vehical {
	String fuelType;
	
	//constructor
	public Bus(String type) {
		fuelType = type;
	}
	
	public void busInfo1() {
		System.out.println("It carries 60 passangers");
	}
	
	public void busInfo2() {
		System.out.println("Runs slower and rough");
	}
}


public class HierarchicalInheritance {
	public static void main(String args[]) {
		System.out.println("Inherited vehical features . . ");
		Car nexon = new Car("petrol");
		nexon.info1();
		nexon.info2();
		System.out.println("|| Nexon car features ||");
		System.out.println("nexon fuel type is:" + nexon.fuelType);
		nexon.carInfo1();
		nexon.carInfo2();
		System.out.println("--------------------------------------");
		
		Bus vrl = new Bus("diseal");
		System.out.println("Inherited vehical features . . ");
		vrl.info1();
		vrl.info2();
		System.out.println("|| VRL bus features ||");
		System.out.println("VRL bus fuel type is:" + vrl.fuelType);
		vrl.busInfo1();
		vrl.busInfo2();
	}
}
