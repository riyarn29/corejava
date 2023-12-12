package in.com.zooooootest;

public class Testmistake {
public static void main(String[] args) {
	try {
		dad();
	} catch (Mistake e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
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
