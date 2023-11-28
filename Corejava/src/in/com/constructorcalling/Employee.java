package in.com.constructorcalling;

public class Employee extends Person{
	
	private String designation;
	
	public Employee() {
		System.out.println("employee default constructor");
	}
	public Employee(String firstName,String lastName,String designation) {
		super(firstName, lastName);
		this.designation=designation;
		System.out.println("employee 3 param constructor");
		}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
}
 //(getter setter is imp otherwise the program will show error this u have to make both constructor and getter
//(setter for constructor calling)