package in.com.javacore;

public class ReverseNumber {
public static void main(String[] args) {
	int num=134;
	int sum=0;
	int r=0;
	int n=num;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
	}
	System.out.println("reverse num="+sum);
}
}
