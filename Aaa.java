package interfaces;

public interface Aaa {
void a();
void b();
void c();
void d();

}
abstract class Abc implements Aaa {
	public void c() {
		System.out.println("the letter is c ");
	}
}
class Az extends Abc {
	public void a() {
		System.out.println("the letter is a ");
	}
public void b() {
	System.out.println("the letter is b ");
}
public void d() {
	System.out.println("the letter is d ");
}
}
class Taster {
	public static void main(String[] args) {
		Az x=new Az();
		x.a();
		x.b();
		x.c();
		x.d();
	}
}