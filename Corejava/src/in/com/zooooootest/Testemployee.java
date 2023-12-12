package in.com.zooooootest;

public class Testemployee {
public static void main(String[] args) {
	Employee e=new Employee("riya",10000,1);
	Employee e2=new Employee("riya",10000,1);

	System.out.println(e);
	System.out.println(e2);
	System.out.println(e.equals(e2));
}
}
