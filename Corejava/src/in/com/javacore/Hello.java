package in.com.javacore;

public class Hello{
public static void main(String[]args) {

String s1="120.5";
String s2="5";
System.out.println(Double.parseDouble(s1)+Integer.parseInt(s2));

	System.out.println(args[5]);
 
	char[] copyFrom= {'a','b','c','d','e','f'};
	char[]copyTo=new char[2];
	System.arraycopy(copyFrom, 3,copyTo, 0, 2);
	System.out.println(new String(copyTo));

}



}