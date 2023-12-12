package in.com.javaarray;

public class Logic {
public void sum(int a,int b) {
	int c=a+b;
	System.out.println(+c);
}
public String name() {
	return "abc";
}
	
	public void isArmstrong(int num) {
	int r=0;
	int sum=0;
	int n=num;
	while(n>0) {
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
		if(num==sum) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong");
		}
	}
	public void isAscending(int arr[]) {
	
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		}
		System.out.println(arr[i]);
}
}
}