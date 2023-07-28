package OOPS;
final class A1{
	final int i=1;
	final public void change() {
//		i++;
		System.out.println(i);
	}
}
class B1 extends A1{
	public void change() {
		super.change();
	}
}
public class finalKeyword {
	public static void main(String[] args) {
		B1 b = new B1();
		b.change();
	}
}
