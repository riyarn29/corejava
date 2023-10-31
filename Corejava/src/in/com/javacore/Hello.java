package in.com.javacore;

public class Hello{
public static void main(String[]args) {

//String s1="120";
//String s2="5";
//System.out.println(Integer.parseInt(s1)/Integer.parseInt(s2));

	//System.out.println(args[5]);
 
	//char[] copyFrom= {'a','b','c','d','e','f'};
	//char[]copyTo=new char[3];
	//System.arraycopy(copyFrom, 2,copyTo, 0, 3);
	//System.out.println(new String(copyTo));

int[] copyFrom= {2,4,6,8,10,12,14,16,18,20};
int[] copyTo= new int[0];
System.arraycopy(copyFrom, 2, copyTo, 0, 5);
System.out.println(new String (copyTo));
}



}