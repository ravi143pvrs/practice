package collectionsconcept;
// non generic program using map concept
// the set is always get in ascending order
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map mp=new HashMap();
// adding elements
mp.put(1,"ravi");
mp.put(5,"raju");
mp.put(3,"ramu");
mp.put(4,"raji");
mp.put(9,"ragu");
// traversing elements
Set s=mp.entrySet(); // converting set
Iterator i=s.iterator();
while(i.hasNext()) {
	Map.Entry en=(Map.Entry)i.next();// converting to map
	System.out.println(en.getKey()+" "+en.getValue());
}
	}

}
