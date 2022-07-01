package week02;

public class Staticmethod {
			int roll;
			String name;
			static String clg="gitam";
			static void change() {
				clg = "aiet";
			}
			
			// calling constructor
			Staticmethod (int r, String n) {
				roll=r;
				name=n;
				
			}
			// method
			void display() {
				System.out.println(+roll+" "+name+" "+clg);
			}
			public class Staticmethod1 {
				
			public static void main(String[] args) {
					// TODO Auto-generated method stub
			// calling objects
				Staticmethod s1 = new Staticmethod(15, "ravi");
				Staticmethod s2 = new Staticmethod(25, "dhanu");
				s1.display();
				s2.display();
				
				}
			}
			

	}