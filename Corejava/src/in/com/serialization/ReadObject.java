package in.com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
public static void main(String[] args) throws Exception{
	
FileInputStream file=new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\marksheet.txt");
ObjectInputStream in=new ObjectInputStream(file);

Marksheet m= (Marksheet)in.readObject();
System.out.println(m.name);
System.out.println(m.maths);
System.out.println(m.physics);
System.out.println(m.chemistry);
System.out.println(m.total);

file.close();
in.close();

}
}