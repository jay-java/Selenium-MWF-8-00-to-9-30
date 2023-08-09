import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number to check : ");
		int num = sc.nextInt();
		int counter = 0;
		for(int i = 1;i<=num;i++){
			if(num%i == 0) {
				counter++;
			}
		}
		if(counter ==2) {
			System.out.println(num+" is prime");
		}
		else {
			System.out.println(num+" is not prime");
		}
	}

}
