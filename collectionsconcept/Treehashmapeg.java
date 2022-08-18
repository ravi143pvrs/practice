package collectionsconcept;
// program for treeHashmap
import java.util.Map;
import java.util.TreeMap;
public class Treehashmapeg {

	public static void main(String[] args) {
TreeMap<Integer,String>t=new TreeMap<Integer,String>();
t.put(1,"ravi");
t.put(3,"raju");
t.put(5,"rome");
System.out.println("descendin map is:- "+t.descendingMap());//descending map
System.out.println("head map:- "+t.headMap(5,true));
System.out.println("tail map:- "+t.tailMap(5,true));
System.out.println("sub map:- "+t.subMap(5,true,3,true));
// sorted map
// headmap return key pairs whose keys are less than or equal to specified map
System.out.println("head map:- "+t.headMap(5));
System.out.println("tail map:- "+t.tailMap(5));
System.out.println("sub map:- "+t.subMap(5,3));
//traversing
for(Map.Entry m:t.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	//t.remove(t);
	t.remove(5);}
	System.out.println("after remoove from map:- ");
	for(Map.Entry m:t.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}}}

