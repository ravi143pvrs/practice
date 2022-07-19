package arrayspack;
import java.util.Scanner;
public class Reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("enter the size of array: ");
int n=in.nextInt();
int end=n-1;
int arr[]=new int[n];
System.out.println(" enter the values: ");
for(int i=0;i<n;i++) {
	arr[i]=in.nextInt();
}
for(int start=0;start<=end;start++) {
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
    end--;
    }
	System.out.println("the array after reverse: ");
	for(int j=0;j<n;j++) {
		System.out.print(arr[j]+" ");
	}
	}
}
