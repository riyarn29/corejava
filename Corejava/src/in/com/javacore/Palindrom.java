package in.com.javacore;

public class Palindrom {
public static void main(String[] args) {
	int num=153;
	int r=0;
	int sum=0;
	int n=num;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	} if(num==sum) {
		System.out.println("palindrom number");
	} else {
		System.out.println("not palindrom");
	}
}
}
