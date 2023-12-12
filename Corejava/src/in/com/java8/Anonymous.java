package in.com.java8;

public class Anonymous {
public static void main(String[] args) {
	Helloo h=new Helloo() {
		
		@Override
		public void say() {
			System.out.println("function interface by anonymous function");
			
		}
	};
	h.say();
}
}
