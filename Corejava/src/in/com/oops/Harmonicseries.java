package in.com.oops;

public class Harmonicseries {
public static void main(String[] args) {
	int num=1;
	double sum=0.0;
	double result =0.0;
	
	for(int i=num;i<=5;i++) {
		result =(double)1/i;
		sum=sum+(double)1/i;
		System.out.println(result);
		
		
	}System.out.println("sum=" +sum);

}
}
