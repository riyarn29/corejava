package in.com.thread;

public class PriorityT extends Thread {
	String name;
public PriorityT(String name) {
	this.name=name;
}
@Override
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(i+" "+name);
	
	}
	
}

}
