package basic;
import java.util.Scanner;

//to execute same code again and again
//4 loops
//1. for(initialization;condition;incre/decre){body}
//2.while(condition){body}
//3.do{body} while(condition);
//4 for each -> for(Type object: list){body}
public class Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num to print table : ");
		int num = sc.nextInt();
		for(int a=1;a<=10;a++) {
			System.out.println(num+" x "+a+" = "+(num*a));
		}
		
		
		
		System.out.println("for loop");
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println("while loop");
		int j = 1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		System.out.println("do while loop");
		int k = 112;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=10);
	}
	
}
