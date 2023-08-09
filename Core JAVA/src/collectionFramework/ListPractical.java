package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Mobile implements Comparator<Mobile> {
	private int ram;
	private String model;
	private double price;

	public Mobile(int ram, String model, double price) {
		super();
		this.ram = ram;
		this.model = model;
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Mobile o) {
		if (this.ram > o.ram) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int compare(Mobile o1, Mobile o2) {
		// TODO Auto-generated method stub
		return 0;
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
		for (Mobile m : list) {
			System.out.println(m);
		}
		
		Comparable<Mobile> com = new Comparable<Mobile>() {

			@Override
			public int compareTo(Mobile o1) {
				if (this.getRam() > o1.getRam()) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Collections.sort(list, com);
		for (Mobile m : list) {
			System.out.println(m);
		}

//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
