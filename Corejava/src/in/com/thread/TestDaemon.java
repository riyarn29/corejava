package in.com.thread;

public class TestDaemon {
public static void main(String[] args) {
	DaemonThread t=new DaemonThread("riya");
	t.setDaemon(true);
	t.start();
for(int i=1;i<=10;i++) {
try {
	Thread.sleep(10);
	} catch (InterruptedException e) {
		e.printStackTrace();
}
	System.out.println(i+"main");

}
System.out.println(t.isDaemon());
}
}
