package in.com.ExceptionHandling;

public class TestFinally {
public static void main(String[] args) {
	try {
		int a=2;
		int b=0;
		int c=a/b;
		System.out.println(c);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	finally {
		System.out.println("finallyyyy");
	}
}
}
