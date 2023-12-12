package in.com.thread;

public class TestByrunnable {
public static void main(String[] args) {
	
//you cant create byrunnable class object becoz it doesnt have the start method therefore you have to
	//hold it in thread object
	
	//Byrunnable b=new Byrunnable("riya");

	Thread t1=new Thread(new Byrunnable("riya")); 
	Thread t2=new Thread(new Byrunnable("rana")); 
		t1.start();
		t2.start();
		}
}
