package in.com.exception;

public class TestNullPointerexc {
public static void main(String[] args) {
	
	String name=null;
	try {
		System.out.println(name.charAt(2));
	}
	catch (Exception e) {
	System.out.println("String exception="+e.getMessage());
	}
	finally {
		System.out.println("finally block");
	}
}
}