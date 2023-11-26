package in.com.abs;

public class Rectangle extends Shape{

	private int length;
	private int width;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void  Rarea(){
		int area=getLength()*getWidth();
		System.out.println("rectangle area="+area);
			
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	
	

}
