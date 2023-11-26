package in.com.exception;

public class TestMultipleExc {
public static void main(String[] args) {

	try {
		int a=10;
		int b=0;	
		int c=a/b;
		
		String name="riyaaa";
		String names=null;
		
		System.out.println("divison="+c);
		System.out.println(name.charAt(5));
		System.out.println(names.length());
		
	} catch (ArithmeticException e) {
		System.out.println("arithmetic exception="+e.getMessage());
	}
	catch (IndexOutOfBoundsException e) {
		System.out.println("String exception="+e.getMessage());
	}
	catch (NullPointerException e) {
		System.out.println("String exception="+e.getMessage());
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println("after try and catch");
	
}
}
