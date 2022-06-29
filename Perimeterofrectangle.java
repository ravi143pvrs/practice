package week01;

public class Perimeterofrectangle {

	int length;
	int width;
	void insert(int l, int w) {
		length = l;
		width = w;
		
	}
	void calculatePerimeter() {
		System.out.println(2*(length+width));
		}
	class Rectanle {
		
	
	public static void main(String[] args) {
	
		Perimeterofrectangle r1 = new Perimeterofrectangle();
		r1.insert(12,45);
		r1.calculatePerimeter();
	}
	
	}

}
