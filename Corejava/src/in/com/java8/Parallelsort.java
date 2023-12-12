package in.com.java8;

import java.util.Arrays;

public class Parallelsort {
public static void main(String[] args) {
	int [] arr= {2,5,8,1,100,67,89,45};
	Arrays.parallelSort(arr);
	System.out.println(arr);
}
}
