package in.com.shapepractise;

public class TestShape {
public static void main(String[] args) {
	
//(calling parent object gives only parent method)
	Shape s=new Shape();
	s.area();
	
//(calling child object=parent method(apart from the common method)+own method
	Rectangle r=new Rectangle();
	r.area();
r.sh();
	
//(this method is overriding because parent method call hoti h aur child method run)
	Shape shape=new Rectangle();
	shape.area(); 
	
	Shape shape1=new Circle();
	shape1.area();
	
	
}
}
