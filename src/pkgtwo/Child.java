package pkgtwo;

public class Child extends Parent{
	
	int i=10;
	
	public void m1() {
		
		System.out.println("m1 of child");
	}
public void m3() {
		
		System.out.println("m3 of child");
	}
public void m4(String s) {
	
	System.out.println("m4 of child");
}
public void m4(int h) {
	
	System.out.println("m4 of child");
}
public void m4() {
	
	System.out.println("m4 of child");
}
public static void main(String[] args) {
	
	Child c1=new Child();

	Parent p1=new Parent();
	Parent p2 =new Child();

	
	//Child c1= new Parent();----not possible
//	c1.m1();
//	c1.m3();
//	c1.m2();
//	c1.m4("hello");
//p1.m1();
//	p1.m2();
//	p2.m1();
	
	
	
//	c1.i;
//	c1.j;



	
}
}
