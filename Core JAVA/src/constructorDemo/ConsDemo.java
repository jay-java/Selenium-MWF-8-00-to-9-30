package constructorDemo;

//constructor -> is special member function of class 
//				which has same name as class name
//	-> called automatically when object is created
// 	-> have no return type
//	-> Three types : 1.Default 2. Parameterized 3.Copy
class Demo {
	int i, j;
	Demo() {
	}

	Demo(int i) {
		System.out.println("para : " + i);
	}

	Demo(int i, int j) {
		this.i = i;
		this.j=j;
		System.out.println("para : i = " + i +" j = "+ j);
	}

	public void showData() {
		System.out.println("i = " + i + " j = " + j);
	}
}

public class ConsDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo(12, 134);
		d1.showData();
	}
}
