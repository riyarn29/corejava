package in.com.constructorcalling;

public class TestConstructorcalling {
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		Employee e1=new Employee("riya","rana","teacher");
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		System.out.println(e1.getDesignation());
		
		Person p=new Person();
		Person p1=new Person("riya","rana","92 ab road");
System.out.println(p1.getFirstName());
System.out.println(p1.getLastName());
System.out.println(p1.getAddress());
		
	}

}
