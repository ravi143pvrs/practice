package stringconcepts;
// program for append,insert,replace,delete,reverse of a mutable class
public class Mutableexample {

	public static void my () {
		StringBuffer s=new StringBuffer("hello ");
		s.append("world");
		System.out.println("the string is: "+s);
		s.insert(2,"ravi");
		System.out.println("insertion string: "+s);
		s.replace(1,3,"java");
		System.out.println("replaced string: "+s);
		StringBuilder s1=new StringBuilder("world");
		s1.replace(1,3,"java");
		System.out.println("the replaced new string: "+s1);
		s1.delete(1,3);
		System.out.println("the deleted string: "+s1);
		s1.reverse();
		System.out.println("the reversed string: "+s1);
	}
public static void main(String[] args) {
	my();
}
}
