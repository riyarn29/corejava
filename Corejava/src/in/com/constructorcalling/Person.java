package in.com.constructorcalling;

public class Person {

	private String firstName;
	private String lastName;
	private String address;
	
	public Person() {
		System.out.println("person default constructor");
	}
	
	public Person(String firstName,String lastName) {
this.firstName=firstName;
this.lastName=lastName;
System.out.println("2 param constructor");
	}
	
	public Person(String firstName,String lastName,String address) {
		//this();
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		System.out.println("person 3 param constructor");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
