package multilevel_inheritance;

//Multilevel Inheritance Program
class India{
	public void indiaInfo1() {
		System.out.println("India is a South Asian country");
	}
	
	public void indiaInfo2() {
		System.out.println("India has rich history and culture");
	}
}

class Maharastra extends India {
	public void maInfo1() {
		System.out.println("Maharastra is the 3rd largest state in india");
	}
	
	public void maInfo2() {
		System.out.println("Maharashtra is one of India's biggest commercial and industrial centres");
	}
}


class pune extends Maharastra{
	public void puneInfo1() {
		System.out.println("Pune is IT and educational hub");
	}
}


public class MultilevelInheritance {
	public static void main(String args[]) {
		pune p1 = new pune();
		p1.indiaInfo1();
		p1.indiaInfo2();
		p1.maInfo1();
		p1.maInfo2();
		p1.puneInfo1();
	}
}
