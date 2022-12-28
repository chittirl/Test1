package pkgtwo;

public class Fibo {

	public static void m1() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  0,1,1,2,3,5,8,13
		
		int n1= 0;
		int n2= 1;
		int sum=0;
		for(int i=1;i<20;i++) {
			
			sum=sum+n1+n2;
			System.out.println(sum);
			
		}

	}

}
