package pkgtwo;

 public class Constructorpractice {

	public static void main(String[] args) {
		
		A o1 = new A();
		A o2 = new A(20);
		A o3 = new A(40,"test");
		
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o3.i);
		System.out.println(o3.j);
		
		
	}
}

class A{
	
	int i;
	String j;
	
	
	public A() {
		
		System.out.println("default constructor");
	}
	
public A(int a) {
		
		i=a;
	}

public A(int a, String b) {
	
	i=a;
	j=b;
}
	
}
