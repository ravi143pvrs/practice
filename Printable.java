package interfaces;
// simple example for interface program

public interface Printable {
void print();
}
interface Showable {
	void show();
	class Aa implements Printable,Showable {
		public void print() {
			System.out.println("hi ravi");
			
			}
	public void show() {
		System.out.println("hello ravi");
		
	}
	public static void main(String[] args) {
		Aa obj=new Aa();
		obj.print();
		obj.show();
	}
	}
}