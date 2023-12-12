package in.com.javaarray;

public class AverageNum {
public static void main(String[] args) {
	int a=10;
	int sum=0;
	int count=0;
	int avg;
	for(int i=0;i<=10;i++) {
		//if(i%2==1){ for odd number}
		if(i%2==1) {
			count++;
			sum=sum+i;
		}
	}
	avg=sum/count;
	System.out.println("average ="+avg);
}
}
