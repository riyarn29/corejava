package in.com.javacore;

public class PractiseForLoop {
public static void main(String[] args) {
	int sum=0;
	for(int i=2;i<=20;i=i+2) {
		sum=sum+i;
		System.out.println(i);
		//System.out.println("sum="+sum);
	}
	System.out.println("sum="+sum);
	
	System.out.println("for loop in decreasing order....");
	for(int i=10;i>=1;i--) {
		
		System.out.println(i);
		
		System.out.println("for loop for name");
		for(int j=1;j<=5;j++) {
			System.out.println("riya");
		}
	}
}
}
