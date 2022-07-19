package arrayspack;
// author ravi kumar
// program for finding min max sum avg of an array
public class Sumaxminarray {

	public static void main(String[] args) { // main method
int arr[]= {1,2,3,4,5,6,7,8,9,10}; // initializing the array
int min=arr[0];
int max=arr[0];
int sum=0;
for(int i=0;i<arr.length;i++) { // loop for checking the conditions
	sum=sum+arr[i];
	if(arr[i]<max) { // condition-01
		min=arr[i];
	}
	if(arr[i]>max) { // condition-02
		max=arr[i];
	}

}double avg=sum/10f; // average formula
System.out.println(" the maximum number is: "+max);
System.out.println(" the minimum number is: "+min);
System.out.println(" the sum of the numbers are: "+sum);
System.out.println(" the average of numbers is: "+avg);
	}
}
