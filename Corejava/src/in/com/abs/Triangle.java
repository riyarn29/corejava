package in.com.abs;

public class Triangle extends Shape {
	private int height;
	private int base;
	public void setBase(int base) {
		this.base = base;
	}
	public int getBase() {
		return base;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void tArea() {
		int tArea=getBase()*getHeight()/2;
		System.out.println("triangle area="+tArea);
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}
