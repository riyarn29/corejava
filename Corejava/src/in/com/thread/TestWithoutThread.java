package in.com.thread;

public class TestWithoutThread {
public static void main(String[] args) {
	
	WithoutThread t1=new WithoutThread("riya");
	WithoutThread t2=new WithoutThread("rana");
	
t1.run();
t2.run();
	
}
}
