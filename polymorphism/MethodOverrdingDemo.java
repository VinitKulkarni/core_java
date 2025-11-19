package polymorphism;

//Method Overriding Program
class ParentClass {
	
	//constructor
	public ParentClass() {
		System.out.println("This is parent class constructor");
	}
	
	public void method1() {
		System.out.println("This is parentclass non-static method");
	}
	
	public int method2(int a) {
		return a;
	}
	
	public static void method() {
		System.out.println("This is static method of parentclass");
	}
}

public class MethodOverrdingDemo extends ParentClass {

	public static void main(String[] args) {
		MethodOverrdingDemo obj = new MethodOverrdingDemo();
		obj.method1();
		
		ParentClass obj1 = new ParentClass();
		obj1.method1();
		ParentClass.method();
		
		System.out.println(obj.method2(111));
	}
	
	public void method1() {
		System.out.println("This is subclass method");
	}
	
	public int method2(int a) {
		return a;
	}
}
