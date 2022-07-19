package arrayspack;
// author ravi kumar
// program for finding even and odd numbers using array
public class Evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10}; // initializing an array
for(int i=0;i<arr.length;i++) { // looping of logic
	if(arr[i]%2==0) // condition for finding even or odd
		System.out.println(" the even numbers are: "+arr[i]);
		else 
		System.out.println(" the odd numbers are: "+arr[i]);
}
}
}
	