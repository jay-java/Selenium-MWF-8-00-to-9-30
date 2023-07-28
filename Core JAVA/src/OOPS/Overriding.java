package OOPS;
class Parent{
	public void call() {
		System.out.println("parent calling");
	}
}
class Child extends Parent{
	public void call() {
		System.out.println("child calling");
		super.call();
	}
}
public class Overriding {
	public static void main(String[] args) {
		Child c = new Child();
		c.call();
	}
}
