package collectionsconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistexample {

	public static void main(String[] args) {
// creating array list
		List<String> ar=new ArrayList<String>();
		// adding objects to an array
		ar.add("ravi");
		ar.add("raam");
		ar.add("santhu");
		ar.add("shannu");
		ar.add("dhanu");
	// printing the array list objects
		System.out.println("size os array list:- "+ar.size()); // list is-5
		System.out.println(ar);
		// removing the element at index-3
		ar.remove(3);
	// printing the array list after removing
		System.out.println(ar);
		System.out.println("size os array list:- "+ar.size());
	// adding some more objects to the array list
		ar.add("sravs");
		ar.add("kavya");
		System.out.println(ar);
		System.out.println("size of array list:- "+ar.size());
		System.out.println("element of index value is:- "+ar.get(0));
		System.out.println("traversing using for loop:-");
		for(int i=0;i<ar.size();i++) {
		System.out.println("the object in array:-"+ar.get(i));
		System.out.println("traversing using for each loop:-");
		for(String s:ar) {
		System.out.println(s);
		}
		System.out.println("traversing using iterator:-");
		Iterator<String> itr=ar.iterator(); // getting the iterator
		while(itr.hasNext()) { // checking the element has iterator
		System.out.println(itr.next()); // print element and move to the next
		}
		System.out.println("traversin using list iterator-forward:- ");
		ListIterator<String> itr1=ar.listIterator(); // getting the iterator
		while(itr1.hasNext()) { // checking the iterator has elements
		System.out.println(itr1.next());// print the elements in forward
		}
		System.out.println("traversin using list iterator-backward:- ");
		ListIterator<String> itr2=ar.listIterator(); // getting the iterator
		while(itr2.hasPrevious()) { // checking the iterator elements
		System.out.println(itr2.previous()); // print the elements in backward
		}
		}
	}
}

