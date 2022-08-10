package collectionsconcept;

import java.util.ArrayList;

// program for inserting element in an array at first position
public class Insertelement {

	public static void main(String[] args) {
		// creating array list
				ArrayList<String> ar=new ArrayList<String>();
				// adding objects to an array
				ar.add(" ");
				ar.add("green");
				ar.add("orange");
				ar.add("white");
				ar.add("black");
			// printing the array list objects
				System.out.println("size of array list:- "+ar.size()); 
				System.out.println(ar);
				ar.add("pink");
				System.out.println(ar);
				System.out.println("element of index value is:- "+ar.get(0));


	}

}
