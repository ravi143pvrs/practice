package collectionsconcept;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueueeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<String>dq=new ArrayDeque<String>();
dq.add("ravi");
dq.add("raju");
dq.add("ramu");
dq.add("ranu");
dq.add("ragu");
dq.add("raji");
dq.offerFirst("remo");
System.out.println("after offer first:- ");
for(String s:dq) {
	System.out.println(s);
}
// dq.poll() and dq.pollfirst() are same as poll()
dq.pollLast();
	System.out.println("after poll last:-");
	for(String s:dq) {
		System.out.println(s);
	}
}
	}

