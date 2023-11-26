package in.com.exception;

public class TestException {
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		try {
		int c=a/b;
		System.out.println("divison="+c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("after");
	}
}


