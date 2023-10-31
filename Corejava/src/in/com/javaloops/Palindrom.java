package in.com.javaloops;

public class Palindrom {
	public static void main(String[] args) {
		int num=172;
		int r=0;
		int sum=0;
		int n=num;
				while(n>0) {
					r=n%10;
					sum=(sum*10)+r;
					n=n/10;
				}
	if(sum==num) {
		System.out.println("palindrom="+sum);
		
	}
	else {
		System.out.println("NOT PALINDROM");
	}
	}

}
