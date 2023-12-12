package in.com.javaarray;

public class SecondLargest {
public static void main(String[] args) {
	int arr[]= {2,35,-6,81,76,91,100,9};
	int max=0;
	int min=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=min;
			min=arr[i];
		}
		if(min>arr[i]&&max<arr[i]) {
			
		}
	}
	System.out.println(min);
}
}