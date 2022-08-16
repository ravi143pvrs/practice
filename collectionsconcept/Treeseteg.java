package collectionsconcept;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeseteg {

	public static void main(String[] args) {
		//creating and adding elements
TreeSet<String>ts=new TreeSet<String>();
ts.add("ball");
ts.add("bat");
ts.add("bail");
ts.add("bowl");
//traversing elements
//Iterator<String>itr=ts.iterator();
//descending order elements 
Iterator<String>itr=ts.descendingIterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
