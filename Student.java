package Ineritanceconcepts;

public class Student {

		int id;
		Address address;
		String name;
		public Student (int id, Address address, String name) {
			this.id=id;
			this.address=address;
			this.name=name;
			
		}
		void display() {
			System.out.println(id+"  "+name);
			System.out.println(address.city+" "+address.state+" "+address.country);
			
		}
		
	public static void main(String[] args) {
		Address address1=new Address("vizag","ap","india");
		Address address2=new Address("mvp","ap","india");
		Student s=new Student(10,address1,"ravi");
		Student s1=new Student(12,address2,"danu");
		s.display();
		s1.display();

	}

}
