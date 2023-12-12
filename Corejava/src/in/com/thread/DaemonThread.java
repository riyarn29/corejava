package in.com.thread;

public class DaemonThread extends Thread {
String name;

public DaemonThread(String name) {
	this.name=name;
	
}
@Override
	public void run() {
	while(true) {
		try {		
			Thread.sleep(2);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(name);

	}
	}
}
