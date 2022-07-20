package arrayspack;
// program for listing an array
import java.util.ArrayList; // array list utilities imported from java list
import java.util.List;  // importing the list from java list
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al=new ArrayList<String>(); // array list-01
al.add("rose"); // add properties of an array
al.add("sunflower");
al.add("lilly");
al.add("tulip");
System.out.println(al);
List<String> all=new ArrayList<String>();  // array list-02
all.add("rose");
all.add("sunflower");
all.add("lilly");
all.add("tulip");
System.out.println(all);
boolean b=al.equals(all); // checking the condition
System.out.println(b);
all.add("redrose");
boolean b1=al.equals(all);
System.out.println(b1);
	}

}
