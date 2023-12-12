package in.com.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{
public String id=null;
public String firstName=null;
public String lastName=null;
public transient double salary=0;   //transient doesnt work in externalizable
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(id);
	//out.writeObject(firstName);
	out.writeObject(lastName);
	out.writeDouble(salary);
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
id=(String)in.readObject();
//firstName=(String)in.readObject();
lastName=(String)in.readObject();
salary=in.readDouble();
}

}
