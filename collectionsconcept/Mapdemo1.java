package collectionsconcept;
// generic
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1,"ravi");
		mp.put(5,"raju");
		mp.put(3,"ramu");
		mp.put(4,"raji");
		mp.put(9,"ragu");
	for(Map.Entry en:mp.entrySet()) {
		System.out.println(en.getKey()+" "+en.getValue());
	}
	}

}
