package in.com.exception;

public class LoginException extends Exception {

	public LoginException() {
		super("user is invalid");
	}
}
