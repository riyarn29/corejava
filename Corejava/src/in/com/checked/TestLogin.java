package in.com.checked;

public class TestLogin {
public static void main(String[] args) {
	String name="ria";
	if(name.equals("riya")) {
		System.out.println("valid");
	}else {
		try {
			throw new LoginExc();
		} catch (LoginExc e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}}

//(checked extends with Exception and try and catch is mandatory or you need to throw exception)