package arrayspack;
 // program for addition of two matrices
public class Addmatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating matrices
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{1,2,3},{4,5,6}};
		int c[][]=new int[2][3]; // store the sum of two matrices
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j]; // addition of matrices
				System.out.print(c[i][j]+" ");
			}
		System.out.println(); // printing the next line
		}
		
	}

}
