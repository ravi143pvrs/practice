package exceptionsconcepts;
// author ravi kumar
// program for usage of try-catch block in exception
import java.util.Scanner;
import java.util.InputMismatchException;
public class Basictrycatch {

	public static void main(String[] args) { // main method
Scanner tmp=new Scanner(System.in);
System.out.println("enter the number:- "); // assign values
try {
	int a=tmp.nextInt();
	int b=tmp.nextInt();
	System.out.println(a/b); // printing the condition
	}
catch(InputMismatchException e) { // print the mismatch exception
	System.out.println(e.getClass().toString());
}
catch(ArithmeticException e) { // printing the arthematic exception
	System.out.println(e);
}
tmp.close();
	}

}
