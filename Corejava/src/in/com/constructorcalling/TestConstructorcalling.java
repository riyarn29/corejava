package in.com.constructorcalling;

public class TestConstructorcalling {
	
	public static void main(String[] args) {
		
		Employee e =new Employee();
		Employee ee =new Employee("riya","rana","teacher");
		System.out.println(ee.getFirstName());
		System.out.println(ee.getLastName());
		System.out.println(ee.getDesination());
		
		
		Person p= new Person("riya","rana","teacher");
		Person pp= new Person("riya","rana");
		
		
		
	}

}
