package in.com.thread;

public class TestRacing {
public static void main(String[] args) {
	Racing t1=new Racing("riya");
	Racing t2=new Racing("sakshi");
	
	t1.start();
	t2.start();
}
}
