package in.com.checked;

public class TestLoginExc {
	public static void main(String[] args) {
		String name="riya";
		if(name.equals("ria")) {
			System.out.println("valid");
		} else {
			try {
				throw new LoginExc ();
			} catch (LoginExc e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
