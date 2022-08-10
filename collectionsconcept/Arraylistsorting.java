package collectionsconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylistsorting {

	public static void main(String[] args) {
// creating array list
		List<String> a1=new ArrayList<String>();
		// adding objects to an array
				a1.add("ravi");
				a1.add("raam");
				a1.add("santhu");
				a1.add("shannu");
				a1.add("dhanu");
		System.out.println("string sorted list:-");
		// sorting array list
		Collections.sort(a1);
		for(String s:a1) {
			System.out.println(s);
			
		}
		List<Integer> i1=new ArrayList<Integer>();
		i1.add(12);
		i1.add(11);
		i1.add(10);
		i1.add(18);
		i1.add(15);
	System.out.println("integers sorted list:-");
	Collections.sort(i1);
	for(int i:i1) {
		System.out.println(i);
	}
	}
}