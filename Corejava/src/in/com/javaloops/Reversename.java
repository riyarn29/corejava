package in.com.javaloops;

public class Reversename {
public static void main(String[] args) {
	String[] names= {"riya","rana"};
	for(int i=0;i<names.length;i++) {
		for(int j=names[i].length()-1;j>=0;j--) {
			
		System.out.print(names[i].charAt(j));
		}
		
		
		System.out.println(" ");
		
	}
		}
		
	

	


}
