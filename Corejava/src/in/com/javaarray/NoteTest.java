package in.com.javaarray;

public class NoteTest {
public static void main(String[] args) {
	int note[]= {500,200,100,50,20,10,5,2,1};
	int count=0;
	int num=1111;
	for(int i=0;i<note.length;i++) {
		count=num/note[i];
		num=num%note[i];
		if(count>0) {
			System.out.println(note[i]+"count="+count);
		}
	}
}
}
