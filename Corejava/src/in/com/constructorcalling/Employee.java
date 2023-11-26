package in.com.constructorcalling;

public class Employee extends Person{
	
	private String desination;
	
	public Employee() {
		System.out.println("employee default constructor");
	}
	public Employee(String firstName,String lastName,String designation) {
		super(firstName, lastName);
		
		this.desination=designation;
		
		System.out.println("employee 3 param constructor");
	}
	
	public String getDesination() {
		return desination;
	}
	public void setDesination(String desination) {
		this.desination = desination;
	}

}
 //(getter setter is imp otherwise the program will show error this u have to make both constructor and getter
//(setter for constructor calling)