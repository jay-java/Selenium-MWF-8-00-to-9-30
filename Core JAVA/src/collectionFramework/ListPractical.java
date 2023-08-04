package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Mobile {
	private int ram;
	private String model;
	private double price;

	public Mobile(int ram, String model, double price) {
		super();
		this.ram = ram;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}

}

public class ListPractical {
	public static void main(String[] args) {
		Mobile m1 = new Mobile(8, "Samsung", 1000.99);
		Mobile m2 = new Mobile(10, "OnePlus", 1200.99);
		Mobile m3 = new Mobile(12, "OPPO", 1400.99);
		Mobile m4 = new Mobile(6, "Apple", 1600.99);
		List<Mobile> list = new ArrayList<Mobile>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		System.out.println(list);
		Iterator<Mobile> itr = list.iterator();
		for(Mobile m:list) {
			System.out.println(m);
		}
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
