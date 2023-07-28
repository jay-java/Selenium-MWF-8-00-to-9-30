package OOPS;
class AA{
	public void area(double r) {
		System.out.println("area of circle : "+(Math.PI*r*r));
	}
	public void area(double h,double b) {
		System.out.println("area of tringle : "+((b*h)/2));
	}
	public void area(int l,int b) {
		System.out.println("area of rect : "+(l*b));
	}
}
public class Overloading {
	public static void main(String[] args) {
		AA a = new AA();
		a.area(3.3);
	}
}
