package in.com.java8;

public interface Sum {
	
	public void abstractmethod();
	
	public static void sum() {
		System.out.println("creating method body in an interface through static method");
	}
	
	public default void summ() {
		System.out.println("creating method body in an interface through default method");
	}

}
