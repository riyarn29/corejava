package in.com.zooooootest;

public class TestLogin {
public static void main(String[] args) {
	String name="riya";
	if(name.equals("ria")) {
		System.out.println("valid");
	} else {
		try {
			throw new Login();
		} catch (Login e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());		}
	}
}
}
