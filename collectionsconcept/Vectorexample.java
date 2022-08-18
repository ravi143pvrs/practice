package collectionsconcept;
// program for vector capacity and size 
import java.util.Vector;
public class Vectorexample {
	public static void main(String[] args) {
Vector<String>v=new Vector<String>(4);
// adding elements to the vector
v.add("cat");
v.add("dog");
v.add("call");
v.add("came");
System.out.println("size:- "+v.size());// getting the size of vector
System.out.println("capacity:- "+v.capacity());// getting capacity of vector
System.out.println(v);// getting all the elements in vector
if(v.contains("cat")) {// checking cat is present or not
	System.out.println("element present");
}else {
	System.out.println("element not present");
}
System.out.println("first element:- "+v.firstElement());// getting first element
System.out.println("last element:- "+v.lastElement());// getting last element
System.out.println("index:- "+v.indexOf("cat"));// checking index of specified element
	}
}