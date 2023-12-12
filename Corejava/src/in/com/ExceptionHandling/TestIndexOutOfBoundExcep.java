package in.com.ExceptionHandling;

public class TestIndexOutOfBoundExcep {
public static void main(String[] args) {
	try {
		String s[]= {"riya"};
		System.out.println(s[9]);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
