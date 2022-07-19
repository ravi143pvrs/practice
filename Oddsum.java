package arrayspack;
// author ravi kumar
// program for finding te sum for odd and even numbers using arrays
import java.util.Scanner;
public class Oddsum {

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in); // initializing the arrays using scanner
System.out.println(" enter the numbers of elements you want to store in array ");
int size=sc.nextInt();
int arr[]=new int[size];// entering the values in an array
System.out.println(" enter the elements of the array: ");
int osum=0,esum=0;
for(int i=0;i<size;i++) 
	arr[i]=sc.nextInt();
for(int i=0;i<size;i++)  
	if(arr[i]%2==0) // checking the condition
		esum=esum+arr[i];
 
		else 
			osum=osum+arr[i];
	System.out.println(" sum of even numbers "+esum);
	System.out.println(" sum of odd numbers "+osum);

  }

}

