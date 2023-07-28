package OOPS;

//OOPS -> object oriented programming system/structure
//1.Class -> structure in which 
//	we can have member function and member variables are there.
//2.OBJect-> instance of class
//3.Inheritance -> to access property one class to another class
//Types -> 1.single 2.multilevel 3.multiple(ambiguity) 4.hierarchical 5.hybrid 
//4.Polymorphism-> same function name but having different functionality
//Types -> 1.Compile time (overloading)
//		-> 2.Runtime (overriding)
//5.Abstraction -> hiding internal details and showing only 
//			essential information to user
//6.Encapsulation-> wrapping up data into single unit
class A { // parent , base
	A(){
		System.out.println("A class cons");
	}
	public void classA() {
		System.out.println("class A function");
	}
}
class B extends A { // child, derived
	public void classB() {
		System.out.println("class B function");
	}
}
class C extends B{
	public void classC() {
		System.out.println("class C function");
	}
}
class D extends A{
	public void classD() {
		System.out.println("class D fun");
	}
}
public class InheritanceDEmo {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();
		C c = new C();
		c.classA();
		c.classB();
		c.classC();
	}
}
