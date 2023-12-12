package in.com.javaarray;

public class ReverseName {
public static void main(String[] args) {
	String name[]= {"riya","rana"};
	for(int i=0;i<name.length;i++) {
		for(int j=name[i].length()-1;j>=0;j--) {
		System.out.print(name[i].charAt(j));
		}
		System.out.println();
	}}
}
