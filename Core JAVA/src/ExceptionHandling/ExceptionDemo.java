package ExceptionHandling;
//Exception -> abnormal situation occurs at runtime

import java.util.InputMismatchException;
//1.try 2.catch 3.finally 4.throw 5.throws
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a = ");
			int a = sc.nextInt();
			System.out.println("enter b = ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("denominator cannot be zero");
		}
		catch (InputMismatchException e) {
			System.out.println("denominator should be numeric value");
		}
		catch (Exception e) {
			System.out.println("error");
		}
		
	}
}
