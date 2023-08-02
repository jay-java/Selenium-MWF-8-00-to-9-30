package ExceptionHandling;
//Exception -> abnormal situation occurs at runtime
//1.Checked -> class which directly inherit Throwable class
//2.Unchecked->class which inherits RuntimeException class
//3.Error - > as per Oracle
import java.util.InputMismatchException;
//1.try 2.catch 3.finally 4.throw 5.throws
import java.util.Scanner;
class Division{ //A
	public void divide() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b<0) {
			throw new ArithmeticException("denominator cannot be zero");
			
		}
		int c = a/b;
		System.out.println(c);
	}
}
public class ExceptionDemo {  //B
	public static void main(String[] args) {
		try {
			Division d = new Division();
			d.divide();
		} catch (ArithmeticException e) {
			System.out.println("denominator cannot be zero");
		}catch (InputMismatchException e) {
			System.out.println("denominator should be numeric value");
		}
		
		
		
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a/b;
//			System.out.println(c);
////			System.exit(54);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator cannot be zero");
//		}
//		catch (InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		}
//		catch (Exception e) {
//			System.out.println("error");
//		}
//		finally {
//			System.out.println("this will exceute everytime");
//		}
	}
}
