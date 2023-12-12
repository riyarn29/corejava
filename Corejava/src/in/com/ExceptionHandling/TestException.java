package in.com.ExceptionHandling;

public class TestException {
public static void main(String[] args) {
	int a=4;
	int b=0;
	try {
		int c=a/b;
		System.out.println("div="+c);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
System.out.println("after");	
}

}
