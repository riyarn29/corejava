package in.com.thread;

public class WithThread extends Thread{
	String name=null;
	public WithThread(String name) {
		this.name=name;
		
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+name);
		}
	}
}
