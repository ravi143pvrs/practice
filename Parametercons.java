package week02;

public class Parametercons {
	String name;
	Parametercons(String name1) {
		name = name1;
		System.out.println("constructor called");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parametercons obj = new Parametercons("ravi");
Parametercons obj1 = new Parametercons("ramya");
Parametercons obj2 = new Parametercons("raju");
	System.out.println("the name is  " +obj.name);
	System.out.println("the name is  " +obj1.name);
	System.out.println("the name is  " +obj2.name);
	}
	

}
