package in.com.stream;

import java.io.File;
import java.util.Date;

public class FileTest {
public static void main(String[] args) {
	File f=new File("C:\\Users\\DELL\\Contacts\\Desktop\\core\\hello.txt");
	if(f.exists()) {
		System.out.println("name="+f.getName());
		System.out.println("absolute path="+f.getAbsolutePath());
		System.out.println("is writable="+f.canWrite());
		System.out.println("is readable="+f.canRead());
		System.out.println("is file="+f.isFile());
		System.out.println("is directory="+f.isDirectory());
		System.out.println("last modified at="+new Date(f.lastModified()));
		System.out.println("size="+f.length());
		
		
	}
}
}
