package in.com.thread;

public class Byrunnable implements Runnable{
String name;

public Byrunnable(String name) {
	this.name=name;
}

@Override
public void run() {
for(int i=1;i<=10;i++) {
	System.out.println(i+" "+name);
}
}

}
