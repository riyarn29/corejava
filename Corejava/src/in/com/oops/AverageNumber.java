package in.com.oops;




public class AverageNumber{

	public static void main(String[] args) {
		int a=10;
		
		int count=0;
		int sum=0;
		int avg;
		
		for (int i = 1; i<=a; i++) {
			
			if (i%2==1) {
				
				sum=sum+i;
				count++;
			}
		
		}
		avg=sum/count;
		System.out.println(avg);
		
		
		
		
	}
	
	
	
	}

	


