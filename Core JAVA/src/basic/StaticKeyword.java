package basic;

//Static variable -> to allocate same memory for every object
//static method-> call by directly class name
//static block -> will execute before main
class Student{
	int id;
	String name;
	long contact;
	static String cname = "TOPS";
	public void call() {
		id = 12;
		System.out.println("call method in student class");
	}
	public static void calling() {
//		id = 12;
		System.out.println("static method in student class");
	}
	static {
		System.out.println("static block in student class");
	}
}
public class StaticKeyword {
	
	public static void main(String[] args) {
		Student s = new Student();
		s.call();
		Student.calling();
	}
	static {
		System.out.println("static block in main class");
	}
}
