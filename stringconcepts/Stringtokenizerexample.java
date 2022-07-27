package stringconcepts;
// program for stringtokenizer concept
import java.util.StringTokenizer;
public class Stringtokenizerexample { // class

	public static void my () {  //method my
		StringTokenizer t=new StringTokenizer("anudip foundation skill and career development", " ");
		while(t.hasMoreTokens()) {
			System.out.println(t.nextToken(" ")); {
			StringTokenizer st=new StringTokenizer("i am ravi, stayin in vizag");
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken(" , "));
			}
		}
	}

}
public static void main(String[] args) {  // main method
	my();
}}
