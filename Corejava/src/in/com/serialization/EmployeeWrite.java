package in.com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeWrite {
public static void main(String[] args) throws Exception{
	FileOutputStream file=new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\employee.txt");
	ObjectOutputStream out=new ObjectOutputStream(file);
	
	Employee e=new Employee();
	e.firstName="riya";
	e.id="1234";
	e.lastName="rana";
	e.salary=500000;
	
	out.writeObject(e);
	file.close();
	out.close();
	
	
}
}
