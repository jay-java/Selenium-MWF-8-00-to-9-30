package interfaceDemo;
//interface -> is same as class but not class.
//			-> cannot create object of interface
//			-> can create reference of interface
//			->by default all properties are abstract in interface
//			->it provides 100% abstraction
//			->when work with class implements keyword uses
//			->multiple class cannot inherited but 
//			  we can implement more than one interface in single class
//			->when interface is implemented than properties of interface
//			  should be defined/implements in class 

class InterImple implements inter1,inte2{

	@Override
	public void interfaace3() {
		// TODO Auto-generated method stub
		System.out.println("interface3 3");
	}

	@Override
	public void interfaace2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}

	@Override
	public void interfaace1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}
	
}
public class InterfaceCall {
	public static void main(String[] args) {
		InterImple i = new InterImple();
		i.interfaace1();
		i.interfaace2();
		i.interfaace3();
		inter1.interfaceeee1();
		inte2.interfaceeee2();
		inte3.interfaceeee3();
	}
}
