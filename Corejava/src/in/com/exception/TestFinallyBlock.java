package in.com.exception;

public class TestFinallyBlock {
public static void main(String[] args) {
	
	try {
		int a=100;
		int b=2;
	 int c=a/b;
	 System.out.println("div="+c);	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("after finally block");
	}
	}
}
