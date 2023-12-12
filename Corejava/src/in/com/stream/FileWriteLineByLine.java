package in.com.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteLineByLine {
public static void main(String[] args) throws IOException{
	FileWriter file= new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\cok.txt");
	PrintWriter pw=new PrintWriter(file);
	for(int i=0;i<=5;i++) {
		pw.println(i+"this is lineeeeee no.");
		
	}
	pw.close();
	file.close();
	
	}
}
