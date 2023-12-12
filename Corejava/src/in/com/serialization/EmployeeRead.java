package in.com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeRead {
public static void main(String[] args) throws Exception{
FileInputStream file=new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\employee.txt");
ObjectInputStream in =new ObjectInputStream(file);

Employee e=(Employee)in.readObject();
System.out.println(e.firstName);
System.out.println(e.id);
System.out.println(e.lastName);
System.out.println(e.salary);

}
}