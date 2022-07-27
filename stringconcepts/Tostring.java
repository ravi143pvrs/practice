package stringconcepts;
// program for tostring concept
public class Tostring {

	int rollno;
	String name,address;
	Tostring(int rollno,String name,String address) {
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
	public String toString() {
		return super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tostring s1=new Tostring(1,"ravi","vizag");
Tostring s2=new Tostring(2,"dhanu","mvp");
System.out.println(s1);
System.out.println(s2);
	}

}
