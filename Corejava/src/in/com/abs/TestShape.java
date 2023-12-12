package in.com.abs;

public class TestShape {
	public static void main(String[] args) {
		
	//by this method the object will call only parent ki method 
Shape s=new Rectangle(); 
s.area();
s.sum();

//by this method you can call child+parent ki method
Rectangle r=new Rectangle();
r.area();
r.sum();
r.rArea();

Circle c=new Circle();
c.area();
c.cArea();
c.sum();

Triangle t=new Triangle();
t.area();
t.tArea();
t.sum();


//or you can make the non abs method static and call it by class name
Shape.summ();

}
}