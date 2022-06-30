package week02;

public class Defaultcons {
	private String name;
	Defaultcons()  {
		System.out.println("constructor called");
		name = "ravi";
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Defaultcons obj = new Defaultcons();
System.out.println("the name is "+obj.name);

	}

}
