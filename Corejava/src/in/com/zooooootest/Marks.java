package in.com.zooooootest;

public class Marks implements Comparable<Marks>{
public int id;
public String name;
public int marks;
public Marks(int id,String name,int marks) {
	this.id=id;
	this.marks=marks;
	this.name=name;
}
@Override
	public String toString() {
		return id+" "+name+" "+marks;
	}
@Override
public int compareTo(Marks o) {
	
	return this.id-o.id;
}

}
