package pkgtwo;

public class Twodarray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {
				      {2,3,4},
				      {5,6,7},
				      {3,5,6}
					};
		
System.out.println(a[0].length);

int mul=1;
for(int i=0;i<a.length;i++) {
	
	int value=a[i][0];
	
	mul=mul*value;
	
		}

System.out.println(mul);


int add=0;
for(int i=0;i<a.length;i++) {
	
	int val=a[i][1];
	
	add=add+val;
	
		}

System.out.println(add);
}

}
	
	
	
	
	
	
	


