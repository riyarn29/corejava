package in.com.stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
public static void main(String[] args) throws Exception {
	
	//write char by char
	
	FileWriter file= new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\coke.txt",true);
	char[] arr= {'r','i','y','a'};
	file.write(arr);
	file.write('\n');
	file.write("yayyyy");
	file.write('\n');
	file.write("56");
	file.close();

}
}
