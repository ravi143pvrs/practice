package collectionsconcept;
import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlistdemo {

	public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("ravi");
	l.add("danu");
	System.out.println("after adding:-");
	// adding an element at a specific position
	l.add(1,"raju");
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("aa");
	ll.add("bb");
	//adding 2nd list of elements to the 1st list 
	l.addAll(ll);
	l.addAll(1,ll);//add 2nd list elements to 1st list at specific position
	l.addFirst("skill");// adding element at the 1st position
	l.addLast("development");//adding an element at the last position
	l.remove("ravi");// remove specific element from array list
	l.remove(1);// remove specific element on the basis of particular position
	l.removeAll(ll);// remove all the new elements
	l.removeFirst();// remove first element from the list
	l.removeLast(); // remove last element from the list
	l.removeFirstOccurrence("ravi"); // remove first occurrence of element
	l.removeLastOccurrence("ravi"); //remove last occurrence of element
	Iterator<String> itr=l.iterator();
	l.clear(); // remove all the elements
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
