package OOPS;
abstract class RBI {
	abstract public void interrest();
	abstract public void HL();
	public static void reporate() {
		System.out.println("reporate : +-4%");
	}
}
class SBI extends RBI {
	public void interrest() {
		System.out.println("sbi : interest : 7%");
	}
	public void HL() {
		System.out.println("sbi hL : 8%");
	}
}
class JAVA extends RBI {
	public void interrest() {
		System.out.println("java : interest : 8%");
	}
	public void HL() {
		System.out.println("java hL : 9%%");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		SBI s=  new  SBI();
		s.interrest();
		s.HL();
		JAVA j = new JAVA();
		j.interrest();
		j.HL();
		SBI.reporate();
		JAVA.reporate();
	}
}
