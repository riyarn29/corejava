package in.com.javacore;

public class Armstrong {
public static void main(String[] args) {
	int num=153;
	int r=0;
	int sum=0;
	int n=num;
	while(n>0) {
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
		if(num==sum) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong");
		}
	
}
}
