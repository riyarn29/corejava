package in.com.ExceptionHandling;

public class TestMultipleException {
public static void main(String[] args) {
	try {
		int a=10;
		int b=2;
		int c=a/b;
		String name="riyaaaaaaa";
		String n=null;
		System.out.println("div="+c);
		System.out.println(name.charAt(7));
		System.out.println(n.length());
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
		System.out.println("after try and catch");
	}
}
}
