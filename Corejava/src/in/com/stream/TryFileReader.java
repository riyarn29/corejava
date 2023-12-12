package in.com.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryFileReader {
public static void main(String[] args) throws IOException {
	try {
		FileReader file=new FileReader("C:\\Users\\DELL\\Contacts\\Desktop\\core\\c.txt");
		int ch=file.read();
		while (ch!=-1) {
			System.out.print((char)ch);
			ch=file.read();
		}
		file.close();
		
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	
}
}
