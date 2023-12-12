package in.com.javacore;

public class NumPattern {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
	System.out.println("another pattern.....");
	for(int x=1;x<=4;x++) {
		for(int y=1;y<=x;y++) {
			System.out.print(y);
		}
		System.out.println(" ");
	}
}

}
