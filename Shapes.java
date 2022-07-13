package polymorpismconcepts;
// program for run time polymorphism
public class Shapes {
void area() {
	System.out.println("in mensuration for every shape tere is area ");
}
}
class rectangle extends Shapes {
	void area() {
		System.out.println("area of rectangle is: length*width");
	}
}
class square extends Shapes  {
	void area() {
		System.out.println("area of square is: length*length ");
	}
}
class triangle extends Shapes {
	void area() {
		System.out.println("area of a triangle is: (1/2)*(base*height)");
	}
}
class circle extends Shapes {
	void area() {
		System.out.println("area of circle is : 3.14*r*r");
	}
}
class Area {
	
	public static void main(String[] args) {
		Shapes obj=new rectangle();
		obj.area();
		Shapes obj1=new square();
		obj1.area();
		Shapes obj2=new triangle();
		obj2.area();
		Shapes obj3=new circle();
		obj3.area();
	}
	}