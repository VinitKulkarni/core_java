package polymorphism;

//Method Overloading Program
public class MethodOverLoadinDemo {

	public static void main(String[] args) {
		MethodOverLoadinDemo object = new MethodOverLoadinDemo();
		object.calculate();
		object.calculate(10,10);
		object.calculate(5,5,5);
		object.calculate(1);
		object.calculate(2,2,2,2);	
		MethodOverLoadinDemo.infoMethod(10000);
	}
	
	//constructor
	public MethodOverLoadinDemo() {
		System.out.println("This is default constructor");
	}
	
	//constructor
	public MethodOverLoadinDemo(int x) {
		System.out.println("This is parameter constructor");
	}
	
	
	public void calculate() {
		System.out.println("this method doing nothing");
	}
	
	public void calculate(int a, int b) {
		System.out.println("this method doing addition");
		System.out.println("Addition:" +(a+b));
	}
	
	public void calculate(int x, int y, int z) {
		System.out.println("this method doing average of 3 numbers");
		System.out.println("Average:" + (x+y+z/3));
	}
	
	public void calculate(int i) {
		System.out.println("this method doing print i value");
		System.out.println("i:" +i);
	}
	
	public void calculate(int a, int b, int c, int d) {
		System.out.println("this method doing multiplcation of 4 numbers");
		System.out.println("Multiplication:" + (a*b*c*d));
	}
	
	//static methods
	public static void infoMethod() {
		System.out.println("This is static method");
	}
	
	public static void infoMethod(String name) {
		System.out.println("This is static + para method");
	}
	
	private static int infoMethod(int a) {
		return a;
	}
}
