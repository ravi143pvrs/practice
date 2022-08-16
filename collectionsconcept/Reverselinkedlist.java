package collectionsconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class Reverselinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> l=new LinkedList<String>();
l.add("ravi");
l.add("danu");
l.add("raju");
l.add("ramya");
Iterator i=l.descendingIterator();// traversing the elements in reverse order
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
