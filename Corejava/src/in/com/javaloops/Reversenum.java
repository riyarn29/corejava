package in.com.javaloops;

public class Reversenum {
	public static void main(String[] args) {
		int num=764;
		int r=0;
		int sum=0;
				int n= num;
				while(n>0) {
					r=n%10;
					sum=(sum*10)+r;
					n=n/10;
				}
System.out.println("Reverse num="+sum);
	}
}			;