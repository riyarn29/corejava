package in.com.abs;

public class Circle extends Shape{
	private int radius;
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void cArea() {
		double cArea=3.14*(getRadius()*getRadius());
		System.out.println("circle area="+cArea);
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}
