package in.com.ExceptionHandling;

public class TestNullPointerExc {
public static void main(String[] args) {
	String name=null;
	try {
		System.out.println(name.charAt(2));
		System.out.println(name.length());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("finally block always runs");
	}
}
}
