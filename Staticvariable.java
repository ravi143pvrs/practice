package week02;

public class Staticvariable {
int roll;
String name;
static String clg="gitam";
// calling constructor
Staticvariable (int r, String n) {
	roll=r;
	name=n;
	
}
// method
void display() {
	System.out.println(+roll+" "+name+" "+clg);
}
public class Staticvariable1 {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
// calling objects
	Staticvariable s1 = new Staticvariable(15, "ravi");
	Staticvariable s2 = new Staticvariable(25, "dhanu");
	s1.display();
	s2.display();
	
	}
}
}
