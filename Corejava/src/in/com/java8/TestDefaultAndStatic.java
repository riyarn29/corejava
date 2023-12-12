package in.com.java8;

public class TestDefaultAndStatic {
public static void main(String[] args) {
	Sum s=new Sum() {
		
		@Override
		public void abstractmethod() {
		
		}
	};
	//for default method you need to create an object of the interface class
	s.summ();
	
	//static method you can call by class name
	Sum.sum();
}
}
