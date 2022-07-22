package wrapperconcepts;

import java.util.ArrayList;

// example for autoboxing
// collection frame work using array list
public class Autobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>a1=new ArrayList<Integer>(); // creating an empty array list of integer type
a1.add(1); // adding the data value using add() method
a1.add(2);
a1.add(3); // autoboxing
System.out.println("Arraylist: "+a1);
	}

}
