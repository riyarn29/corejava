package in.com.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Binaryfile {
	public static void main(String[] args) throws IOException{
		
		String source="C:\\Users\\DELL\\OneDrive\\Pictures\\Saved Pictures\\blue.PNG";
		String target="C:\\Users\\DELL\\OneDrive\\Desktop\\core\\blues.PNG";
		
		FileInputStream in=new FileInputStream(source);
		FileOutputStream out=new FileOutputStream(target);
		
		int ch=in.read();
		while(ch!=-1) {
			out.write(ch);
			ch=in.read();
		}
		in.close();
		out.close();
	}

}
