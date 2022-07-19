package arrayspack;
// program for simple cloned array
public class Clonnedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {44,4,5,6}; // declaring and initializing values
		System.out.println(" print the actual array ");
		for(int i:arr) // for each loop for printing
			System.out.println(i); //print the values
		System.out.println(" print the clonned array ");
		int carr[]=arr.clone();  //creating clone
		for(int i:arr) //for each loop for cloning an array
			System.out.println(i);
		System.out.println(" both are equal or not ");
		System.out.println(arr==carr); //checking??
	}

}
// the output is false because the references are different but values are same 