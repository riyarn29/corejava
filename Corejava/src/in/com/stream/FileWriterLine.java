package in.com.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterLine {
public static void main(String[] args) throws IOException{
	FileWriter file=new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\co.txt",true);
	PrintWriter pw=new PrintWriter(file);
	pw.println("hiiii this is line 1");
	pw.println("hiiii this is line 2");
	pw.println("hiiii this is line 3");
	
	pw.close();
	file.close();
}
}
