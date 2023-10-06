
import java.util.Scanner;

public class TheDPizza {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to D pizza");
		System.out.println("Small pizza-150, medium pizza-250, large pizza-350, monster pizza-500");
		System.out.println("Offers on " + "Buy 4 small pizza & get 500 ml coke free");
		System.out.println("Buy 3 Medium pizza & get garlic bread");
		System.out.println("Buy 3 large pizza & get 500 ml coke+ garlic bread free");
		System.out.println("Buy 2 monster pizza and get 500ml coke+garlic bread + icecream");
		System.out.println("enter pizza size : ");
		String size = sc.next();
		System.out.println("enter qty : ");
		int qty = sc.nextInt();
		if (size.equals("small")) {
			if (qty == 4) {
				System.out.println("Got Offer on 4 pizza : ");
				System.out.println("Your bill is : " + (qty * 150));
			} else {
				System.out.println("Your bill is : " + (qty * 150));
			}
		}

		if (size.equals("medium")) {
			int c = 0;
			if (qty >= 4) {

				for (int n = 4; n <= qty; n += 4) {
					System.out.println(n);
					if (qty % n == 0) {
//						c++;
//						System.out.println("c = "+c);
					}
					if (n > 0) {
						c++;
					}
				}
				System.out.println("You got offer " + c + " times : ");
				System.out.println("You got offer : " + (500 * c) + "ml coke : ");
				System.out.println("Your bill is : " + (qty * 250));
			} else {
				System.out.println("Your bill is : " + (qty * 150));
			}
		}

	}
}