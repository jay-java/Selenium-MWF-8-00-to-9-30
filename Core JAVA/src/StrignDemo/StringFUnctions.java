package StrignDemo;

import java.util.Scanner;
//String -> sequence o9f characters
public class StringFUnctions {
	public static void main(String[] args) {
		System.out.println("hello java @#$%^");
		char name[] = {'J','A','V','A'};
		System.out.println(name);
		String s = "JAVA";
		System.out.println(s.concat(" tech"));
		System.out.println("new String"+s);
		System.out.println(s);
		String s1= "hello new java String";
		System.out.println(s1.length()); // to check length of string
		System.out.println(s1.charAt(20)); // to check character at index
		String s2 = "JAVA";
		String s3 = "JAVA";
		//strings equality check return ascii value 
		System.out.println("comparison of string  : "+s2.compareTo(s3));
//		strings equality check return ascii value 
		System.out.println(s2.compareToIgnoreCase(s3));
		//strings equality check return boolean value
		System.out.println(s2.equals(s3));
		//strings equality check return boolean value
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println("---------");
		String s4 ="      java java			";
		System.out.println(s4.isBlank()); // total string empty
		System.out.println(s4.isEmpty()); // will consider space as character
		System.out.println(s4.trim()); //remove before and after string space
		Scanner sc = new Scanner(System.in);
		System.out.println("enter strign : ");
		String user =sc.nextLine(); //string uesr input
		System.out.println(user);
		System.out.println("enter character : ");
		char c = sc.next().charAt(0); //take character user input
		System.out.println(c);
	}
}
