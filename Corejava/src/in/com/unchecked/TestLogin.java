package in.com.unchecked;

public class TestLogin {
	public static void main(String[] args) {
	
	String name="ri";
	if (name.equals("riya")) {
		System.out.println("valid haiiii");
	} else {
		
		throw new Loginex();
	}
	
	
}}
//(unchecked extends with RuntimeException and try and catch isnt mandatory,error handled by compiler)