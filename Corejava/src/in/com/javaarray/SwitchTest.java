package in.com.javaarray;

public class SwitchTest {
public static void main(String[] args) {
	String value="add";
	//switch should be either in int char or string
	switch(value) {
	case "add":
		System.out.println("case add");
	break;
	case "div":
		System.out.println("case div");
		break;
		default:
			System.out.println("nooooo");
	break;
	}
}
}
