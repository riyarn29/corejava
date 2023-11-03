package in.com.oops;

public class Largestnumber {
public static void main(String[] args) {
	int[] arr= {2,56,7,189,22,99,6};
	int max=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	} 
	System.out.println("maximum="+max);
}
}
