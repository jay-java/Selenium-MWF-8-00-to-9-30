package Functions;

//function->block of code to execute same code again and again
//types of function 
//1.Predefine->
//2.User define
import java.util.Scanner;

//category of function
//1.Without return type without parameter/argument
//2.Without return type with parameter
//3.With return type without parameter
//4.With return type with parameter
class Call {
	public int RunFunction(int i, double d, String name) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num = ");
		int num = sc.nextInt();
		System.out.println("hello run function");
		return num;
	}
}
public class TYpes {
	public static void main(String[] args) {
		System.out.println("hello");
		Call c = new Call();
		int i = c.RunFunction(10, 32.3, "java");
//		int i = c.RunFunction();
		System.out.println(i);
		System.out.println("hello main");
	}
}
