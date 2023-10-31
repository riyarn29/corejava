package in.com.javaloops;

public class Number {
public static void main(String[]args) {
	int sum=0;
	for(int i=100;i>=10;i=i-10){
		System.out.println(i);
		sum=sum+i;
	}
	System.out.println("sum="+sum);
	
}
}
