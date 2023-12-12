package in.com.javacore;

public class StringBasic {
public static void main(String[] args) {
	String name="hello";
	for(int i=0;i<name.length();i++) {
	System.out.println(name.charAt(i));
}
	
	//no. of times a character appears in the string
	
	int count=0;
	for(int j=0;j<name.length();j++) {
		if(name.charAt(j)=='l') {
			count++;
		}
	}
	if(count>0) {
		System.out.println("count="+count);
	}
}}
