package in.com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
public static void main(String[] args) throws IOException {
	
FileOutputStream file=new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\marksheet.txt");
ObjectOutputStream out=new ObjectOutputStream(file);
	
Marksheet m=new Marksheet();
m.name="riya";
m.chemistry=55;
m.physics=43;
m.maths=11;
m.getTotal();

out.writeObject(m);
file.close();
out.close();
}
}
