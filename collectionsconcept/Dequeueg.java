package collectionsconcept;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeueg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String>dq=new ArrayDeque<String>();
dq.add("ram");
dq.add("karan");
dq.add("riya");
dq.add("priya");
dq.add("sam");
for(String s:dq) {
	System.out.println(s);
	dq.addFirst("raavii");
	dq.addLast("raamuu");
	System.out.println("new list:- ");
	for(String s1:dq) {
		System.out.println(s1);
		}
		
dq.removeFirst();
dq.removeLast();
System.out.println("new list after removal:- ");
for(String s2:dq) {
	System.out.println(s2);
	}
}	}}