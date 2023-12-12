package in.com.collectionframeworkk;

public class Employee1 {
	
	private int id;
	private String name;
	private int salary;
	
	
	public Employee1(int id,String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		
		return id + " " + name + " " + salary;
	}
	
	@Override
	public boolean equals(Object obj) {
	if (obj instanceof Employee1) {
		Employee1 e = (Employee1) obj;
		boolean b = this.id == e.id && this.name == e.name && this.salary == e.salary;
		return b;
	} return false;
	}
	
	@Override
	public int hashCode() {
		String str = id + name + salary;
		return str.hashCode();
	}
}
