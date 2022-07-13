package week03;

import java.util.Scanner;
public class Encapsulationdemo {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String stuname;
	int stupass,sid;
	int s1,s2,s3,s4,s5;

	System.out.println("enter your name ");
	stuname=s.nextLine();
	System.out.println("enter password ");
	sid=s.nextInt();
	System.out.println("enter username");
	stupass=s.nextInt();
	
	System.out.println("enter te marks of five subjects ");
	System.out.println("enter te marks of subject1 ");
	s1=s.nextInt();
	System.out.println("enter te marks of subject2 ");
	s2=s.nextInt();
	System.out.println("enter te marks of subject3 ");
	s3=s.nextInt();
	System.out.println("enter te marks of subject4 ");
	s4=s.nextInt();
	System.out.println("enter te marks of subject5 ");
	s5=s.nextInt();
	
	encap_d obj=new encap_d();
	
	obj.set_name(stuname);
	obj.set_pass(stupass);
	obj.set_stu_id(sid);
	
	System.out.println("Name: "+obj.get_name());
	System.out.println("user id: "+obj.get_stu_id());
	System.out.println("password: "+obj.get_pass());
	obj.calc(s1,s2,s3,s4,s5);
	System.out.println("percentage:  "+obj.percentage);
}
}

class encap_d {
	private String student_name;
	private int studentuser_id;
	private int password;
	int total,percentage;
	public String get_name() {
		return student_name;
	}
	public int get_stu_id() {
		return studentuser_id;
	}
	public int get_pass() {
		return password;
	}
	public void set_name(String stu) {
		student_name=stu;
	}
	public void set_stu_id(int stu) {
		studentuser_id=stu;
	}
	public void set_pass(int stu) {
		password = stu;
	}
	public void calc(int s1,int s2, int s3, int s4, int s5) {
		total=(s1+s2+s3+s4+s5);
		percentage=(total/5)*100;
		
	}
}