package in.com.exception;

public class TestLoginExc {
public static void main(String[] args) {
	
	String name="Roma";
	if (name.equals("Roman"))
	{
		System.out.println("user is valid");	
	} else {
		try {
			throw new LoginException();
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
}
