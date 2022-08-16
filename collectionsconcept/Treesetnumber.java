package collectionsconcept;

import java.util.Iterator;
import java.util.TreeSet;
// navigable set operation
public class Treesetnumber {

	public static void main(String[] args) {
		// creating and adding elements
		TreeSet<String>ts=new TreeSet<String>();
/*		ts.add("23");
		ts.add("12");
		ts.add("15");
		ts.add("99"); */
		ts.add("M");
		ts.add("N");
		ts.add("O");
		ts.add("P");
		ts.add("Q");
		//traversing elements
		//Iterator<String>itr=ts.iterator();
		//descending order elements 
		//Iterator<String>itr=ts.descendingIterator();
		//while(ts.hasNext()) {
			//System.out.println(ts.pollFirst());
			//System.out.println(ts.pollLast());
			System.out.println("oriinal set:-"+ts); //output---MNOPQ
			//System.out.println("reverse set:-"+ts.descendingSet()); // output---QPONM
			//sorted set operation with out boolean
			System.out.println("Head set:- "+ts.headSet("O")); // output---MNQ/MNO
			System.out.println("sub set:- "+ts.subSet("M","Q")); // output---PQ
			System.out.println("tail set:- "+ts.tailSet("O"));
			}
		}