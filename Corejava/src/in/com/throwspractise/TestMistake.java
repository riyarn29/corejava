package in.com.throwspractise;

public class TestMistake {
public static void main(String[] args) {
	try {
		dad();
	} catch (Mistake e) {
	System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
public static void dad() throws Mistake {
	mom();
}
public static void mom() throws Mistake {
	son();
}
public static void son() throws Mistake {
	throw new Mistake();
}


}
