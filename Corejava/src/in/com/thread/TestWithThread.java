package in.com.thread;

public class TestWithThread {
public static void main(String[] args) {

	WithThread t1=new WithThread("riya");
	WithThread t2=new WithThread("rana");
	
t1.start();
t2.start();
}
}

