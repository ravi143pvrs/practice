package week02;

public class Thiskeyword {
int roll;
String name;
float fee;
Thiskeyword(int roll, String name, float fee) {
	this.roll=roll;
	this.name=name;
	this.fee=fee;
	
}
void display() {
	System.out.println(roll+" "+name+" "+fee);
}
public class Thiskeyword1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Thiskeyword a1 = new Thiskeyword(12, "ravi", 1000);
	Thiskeyword a2 = new Thiskeyword(10, "raju", 2000);
	a1.display();
	a2.display();
	
	}
	
	}

}
