package in.com.javaloops;

public class Testnotecount {
	public static void main(String[] args) {
		int num =11111;
		int count=0;
		int[]notes= {2000,500,200,100,50,20,10,5,2,1};
		for(int i=0;i<notes.length;i++) {
			count=num/notes[i];
			num=num%notes[i];
			if(count>0) {
				System.out.println(notes[i]+"="+count);
			}
			
		}
	}

}
