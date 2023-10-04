package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set set  = new TreeSet();
		set.add(1);
		set.add(3);
		set.add(-3);
		set.add(5656);
		set.add(3456);
		set.add(-344);
		set.add(0);
		set.add(10);
		System.out.println(set);
		
	}
}
