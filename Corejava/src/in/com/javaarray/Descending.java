package in.com.javaarray;

public class Descending {
public static void main(String[] args) {
	int temp=0;
	int arr[]= {2,13,-19,67,104,21};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println(arr[i]);
	}
}
}
