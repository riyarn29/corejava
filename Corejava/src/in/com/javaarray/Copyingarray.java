package in.com.javaarray;

public class Copyingarray {
public static void main(String[] args) {
	char[] copyFrom= {'a','c','d','f','h','j'};
	char [] copyTo=new char[4];
	System.arraycopy(copyFrom, 2, copyTo, 0, 4);
	System.out.println(new String(copyTo));
	
	//string into integer
	String s1="123";
	String s2="22";
	System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
}
}
