package in.com.zooooootest;

public class Exc {
public static void main(String[] args) {
	int a=10;
		int b=10;
String name[]= {"riya","rana"};
String s=null;
try {
	int c=a/b;
	System.out.println(c);
	System.out.println(name[1]);
	System.out.println(s.charAt(4));
	
} catch (ArithmeticException e) {
	System.out.println(e.getMessage());
}
catch (IndexOutOfBoundsException e) {
	System.out.println(e.getMessage());
}
catch (NullPointerException e) {
	System.out.println(e.getMessage());
}
finally {
	System.out.println("after");
}

}
}
