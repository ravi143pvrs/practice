package collectionsconcept;
// program for understanding null in map
import java.util.HashMap;
import java.util.Map;

public class Nulleg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1,"ravi");
		mp.put(5,"raju");
		mp.put(3,"ramu");
		mp.put(4,"raji");
		mp.put(9,"ragu");
		mp.put(null, null); // does not consider
		mp.put(12, null);
		mp.put(null,"raavii"); // this one will print first
		// traversing
		for(Map.Entry en:mp.entrySet()) {
		System.out.println(en.getKey()+" "+en.getValue());
	}
	}

	}

