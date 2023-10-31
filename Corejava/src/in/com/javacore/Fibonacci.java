package in.com.javacore;

public class Fibonacci {
	public static void main(String[] args) {
		
	int x=1;
	
			int y=0;
			System.out.println(x +"\n" + y);
			
			for(int i=1;i<=5;i++) {
	int z=x+y;
	x=y;
	y=z;
	System.out.println(z);
	}
	}
}

