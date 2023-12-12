package in.com.thread;

public class TestPriority {
public static void main(String[] args) {
	PriorityT p=new PriorityT("riya");
	PriorityT p2=new PriorityT("khushi");
	
	p.setPriority(10);
	p2.setPriority(1);
	
	p.start();
	p2.start();
	System.out.println(p.getPriority());
}
}
