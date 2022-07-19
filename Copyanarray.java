package arrayspack;

public class Copyanarray { //class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]copyFrom= {'a','c','d','r','e','w','n','d'};// declaring source array
	
	char[]copyTo=new char[7]; //declaring destination array
	System.arraycopy(copyFrom,1,copyTo,0,7);
	//System.arraycopy(copyFrom,1,copyTo,2,7); error occur as array index out of bounce
	System.out.println(String.valueOf(copyTo)); //print the destination array
	}

}
