
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
		boolean flag = true;
		while (flag) {
			System.out.println("Do you want to purchase pizza ? : Y/N");
			String s = sc.next();
			System.out.println("Welcome to D pizza");
			System.out.println("Small pizza-150, medium pizza-250, large pizza-350, monster pizza-500");
			System.out.println("Offers on " + "Buy 4 small pizza & get 500 ml coke free");
			System.out.println("Buy 3 Medium pizza & get garlic bread");
			System.out.println("Buy 3 large pizza & get 500 ml coke+ garlic bread free");
			System.out.println("Buy 2 monster pizza and get 500ml coke+garlic bread + icecream");
			if (s.equalsIgnoreCase("y")) {
				System.out.print("Enter the pizza size (small/medium/large/monster): ");
				String pizzaSize = sc.next();
				if (pizzaSize.equalsIgnoreCase("small")) {
					System.out.println("enter num of pizza : ");
					int qty = sc.nextInt();
					if (qty == 4) {
						System.out.println("offer");
					} else {

					}
				} else if (pizzaSize.equalsIgnoreCase("medium")) {
					System.out.println("enter num of pizza : ");
					int qty = sc.nextInt();
					if (qty == 3) {
						System.out.println("offer");
					} else {

					}
				}
				System.out.println("Do you want to purchase pizza more ? : Y/N");
				String s1 = sc.next();
				if (s1.equalsIgnoreCase("y")) {
					System.out.println("Welcome to D pizza");
					System.out.println("Small pizza-150, medium pizza-250, large pizza-350, monster pizza-500");
					System.out.println("Offers on " + "Buy 4 small pizza & get 500 ml coke free");
					System.out.println("Buy 3 Medium pizza & get garlic bread");
					System.out.println("Buy 3 large pizza & get 500 ml coke+ garlic bread free");
					System.out.println("Buy 2 monster pizza and get 500ml coke+garlic bread + icecream");
					System.out.print("Enter the pizza size (small/medium/large/monster): ");
					String pizzaSize1 = sc.next();
					if (pizzaSize1.equalsIgnoreCase("small")) {
						System.out.println("enter num of pizza : ");
						int qty = sc.nextInt();
						if (qty == 4) {
							System.out.println("offer");
						} else {

						}
					} else if (pizzaSize1.equalsIgnoreCase("medium")) {
						System.out.println("enter num of pizza : ");
						int qty = sc.nextInt();
						if (qty == 3) {
							System.out.println("offer");
						} else {

						}
					}
				} else {
					flag = false;
					break;
				}

			}
		}
	}
}