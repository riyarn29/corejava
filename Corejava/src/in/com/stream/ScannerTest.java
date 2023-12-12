package in.com.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) throws IOException {
	FileReader file= new FileReader("C:\\Users\\DELL\\OneDrive\\Desktop\\core\\coco.txt");
	Scanner sc=new Scanner(file);
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	file.close();
}
}
