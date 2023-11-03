package in.com.javacore;

public class Practisedivisionn {
public static void main(String[] args) {
	int a=7;
	int count=0;
	int sum=0;
	for(int i=500;i<=1000;i++) {
		if(i%a==0) {
		count=i;
		
System.out.println(count);
sum = sum+i;
	}
	}
	System.out.println("sum="+sum);
}
}
