package collectionsconcept;
// program for stack concept
import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer>s=new Stack<>();
boolean result=s.empty();
System.out.println("Is the stack empty? "+result);
//adding elements in stack by push method
s.push(25);
s.push(75);
s.push(65);
s.push(55);
s.push(45);
s.push(35);
System.out.println("stack elemets:- "+s);// display all elements in stack
Integer d=s.peek();
System.out.println("top element:- "+d);// display the top element in stack
int d1=s.search(55);
System.out.println("search element:- "+d1);// search element in the stack
int x=s.size();
System.out.println("stack size is:- "+x);// finding the size of stack
result=s.empty();
System.out.println("is the stack is empty? "+result);// checking empty or not
}}