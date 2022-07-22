package wrapperconcepts;

import java.util.ArrayList;

public class Unboxingeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a1=new ArrayList<Integer>();
a1.add(3); // autoboxing
a1.add(5);
System.out.println("arraylist: "+a1);
int a=a1.get(0); // unboxing (3 Integer converted to int )
System.out.println("value of index 0: "+a);
	}

}
