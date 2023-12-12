package in.com.javacore;

public class Division {
public static void main(String[] args) {
	int a=7;
	int sum=0;
	for(int i=100;i<=200;i++) {
		if(i%a==0) {
			System.out.println(i);
			sum=sum+i;
		}
	}
	System.out.println("sum="+sum);
}
}
