package in.com.javacore;

public class Division {
	public static void main(String[] args) {
		
		int a =7;
		int count=0;
		int sum=0;
		for(int i=100;i<=200;i++) {
			if(i%a==0) {
				count=i;
				System.out.println(count);
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}

}
