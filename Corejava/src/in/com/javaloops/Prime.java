package in.com.javaloops;

public class Prime {
public static void main(String[]args) {
int num=12;
int count=0;
for(int i=1;i<=11;i++) {
	if(num%i==0) {
		count++;
	}
}
	if(count==2) {
		System.out.println("prime");
	}
	else {
		System.out.println("not prime");
	}
}
}




