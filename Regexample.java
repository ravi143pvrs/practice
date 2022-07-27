package regexconcepts;
//program for simple regular expression concepts
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regexample {

	public static void main(String[] args) {
	Pattern p=Pattern.compile(".a");
	Matcher m=p.matcher("ma");
	boolean b=m.matches();
	
	boolean bb=Pattern.compile("..m").matcher("aam").matches();
	
	boolean b1=Pattern.matches("[a-zA-Z0-9]{8,}","anud123ppp");
	
	boolean b2=Pattern.matches("[6789]{1}[0-9]{9}","8348222888");
	
	boolean b3=Pattern.matches("^[a-z0-9+_.-]*@[a-zA-Z0-9]*+\\.[a-z]{3}","ravit123@gmail9.com");
	
	boolean b4=Pattern.matches("^[a-zA-Z0-9+_.-]{8,}","ravit@123_.");
	
	System.out.println(b+" "+bb+" "+b1+" "+b2+" "+b3+" "+b4);
	}

}
