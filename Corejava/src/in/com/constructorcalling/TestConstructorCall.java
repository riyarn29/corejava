package in.com.constructorcalling;

public class TestConstructorCall {
public static void main(String[] args) {
	Employee e=new Employee();
	Employee e1=new Employee("riya","rana","cheater");
	
	System.out.println(e1.getAddress());
	System.out.println(e1.getDesignation());
	System.out.println(e1.getFirstName());
	System.out.println(e1.getLastName());
	
	
	Person p =new Person("riya","rana","bhh");
	System.out.println(p.getAddress());
	System.out.println(p.getFirstName());
	System.out.println(p.getLastName());
}
}
