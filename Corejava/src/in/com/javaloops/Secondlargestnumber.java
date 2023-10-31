package in.com.javaloops;

public class Secondlargestnumber {
	public static void main(String[] args) {
		int[] arr= {12,66,54,32,89,100};
		int max=0;
		int min=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				min=max;
				max=arr[i];
			}
			if(min<arr[i]&&max>arr[i]) {
				
			}
		}
		System.out.println("secong largest="+min);
	}

}
