package in.com.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class KeyboardRead {
public static void main(String[] args) throws IOException{
	
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader buff =new BufferedReader(in);
	
PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\cc.txt",true));
			String line= buff.readLine();
			while(!line.equals("quit")) {
				pw.println(line);
				line=buff.readLine();
			}
	buff.close();
	pw.close();
	
}
}