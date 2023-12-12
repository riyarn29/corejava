package in.com.stream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
public static void main(String[] args) throws IOException {
	
	//read char by char
	
	FileReader file= new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\hello.txt");
	
	int ch=file.read();
	while(ch!=-1) {
		System.out.print((char)ch);
		ch=file.read();
	}
	file.close();
	
	
}
}
