package in.com.exception;

public class TestIndexOutOfBoundExc {
public static void main(String[] args) {
	
	try {
		String[]s = {"abc"};
		String name="riya";
		System.out.println(s[0]);
		System.out.println(name.charAt(5));
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
