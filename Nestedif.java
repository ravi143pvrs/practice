package week01;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "delhi, india";
		if (address.endsWith("india")) {
			if (address.contains("bombay")) {
				System.out.println("your city is bombay");
			} else if(address.contains ("goa")) {
				System.out.println("your city is goa");
			}else {
				System.out.println("you are not living in india");
			}
		}
	}

}
