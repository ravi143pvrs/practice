package wrapperconcepts;
// program for wrapper to primitive conversion
public class Autoboxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer a=new Integer(2);
Integer i=a.intValue(); // converting integer to int
Integer j=a; // compiler will write int.value() unboxing
System.out.println(a+" "+i+" "+j);
	}

}
