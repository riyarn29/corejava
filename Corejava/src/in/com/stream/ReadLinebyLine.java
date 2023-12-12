package in.com.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinebyLine {
public static void main(String[] args) throws IOException {
	FileReader file=new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\coco.txt");
	BufferedReader in =new BufferedReader(file);
	String line=in.readLine();
	while(line!=null) {
		System.out.println(line);
		line=in.readLine();
	}
	in.close();
	file.close();
}
}

