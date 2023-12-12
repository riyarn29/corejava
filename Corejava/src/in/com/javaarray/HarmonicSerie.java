package in.com.javaarray;

public class HarmonicSerie {
public static void main(String[] args) {
	double sum=0;
	double result=0;
	for(int i=1;i<=5;i++) {
		result=(double)1/i;
		sum=result+sum;
		System.out.println(result);
	}
	System.out.println("sum="+sum);
}
}
