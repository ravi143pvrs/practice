package collectionsconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Hasnextiterator {

	public static void main(String[] args) {
ArrayList<String> as=new ArrayList<>();
as.add("red");
as.add("black");
as.add("green");
as.add("orange");
as.add("white");
Iterator<String> itr1=as.iterator();
while(itr1.hasNext()) {
	System.out.println(itr1.next());
}
	}

}
