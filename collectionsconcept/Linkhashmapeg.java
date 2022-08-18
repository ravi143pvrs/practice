package collectionsconcept;
// program for linked hashmap 
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkhashmapeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer,String>lm=new LinkedHashMap<Integer,String>();
lm.put(1,"ravi");
lm.put(2, "raju");
lm.put(6, "ramu");
lm.put(8,"raji");
lm.put(12,"rom");
lm.put(null, null);
lm.put(2, null);
lm.put(null,"raam");
lm.putIfAbsent(15,"rome");
lm.putIfAbsent(6,"rose");
//keys are
System.out.println("keys are:- "+lm.keySet());
// values are
System.out.println("values are:- "+lm.values());
// key-value pairs are
System.out.println("key-value pars are:- "+lm.entrySet());
for(Map.Entry m:lm.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}
// remove map element
//lm.remove(lm);// for all elements
lm.remove(8);// for particular element
System.out.println("after remove the element");
// traversing map
for(Map.Entry m:lm.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
	}}}
