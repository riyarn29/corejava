package in.com.thread;

public class Racing extends Thread{
	String name=null;
	static Account acc=new Account();
	public Racing(String name) {
		this.name=name;
		
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			this.acc.deposit(100, name);
		}
	}

}
