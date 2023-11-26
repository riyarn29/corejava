package in.com.polyreturntype;

public class Shape {
	
	public static Shape getShape(int i) {
		if(i==1)
		return new Rectangle();
		if(i==2)
			return new Circle();
		
	}

	public void area() {
		System.out.println("shape method");
		
	}
}
